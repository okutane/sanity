package ru.urururu.sanity.rules

import java.util.function.Consumer

import ru.urururu.sanity.FlowAnalyzer
import ru.urururu.sanity.api.cfg.BinaryExpression.Operator
import ru.urururu.sanity.api.cfg._
import ru.urururu.sanity.api.{Cfg, Violation}

/**
  * @author <a href="mailto:dmitriy.g.matveev@gmail.com">Dmitry Matveev</a>
  */
class DivisionByZero {
  def findAll(cfg: Cfg, consumer: Consumer[Violation]): Unit = {
    val fa = new FlowAnalyzer
    val states = fa.analyze(cfg)

    states.foreach { case (cfe, state) => cfe match {
      case assign: Assignment => assign.getRight match {
        case expression: BinaryExpression => expression.getOperator match {
          case Operator.Div | Operator.Rem => state.getPossibleValues(expression.getRight).foreach {
            case const: Const => if (const.getValue == 0) consumer.accept(new Violation {
              override def getPoint: Cfe = cfe

              override def getValue: RValue = expression.getRight
            })
            case _ => // ignore other values
          }
          case _ => // ignore other operators
        }
        case _ => // ignore other assignment types
      }
      case _ => // ignore other cfe types
    }
    }
  }
}
