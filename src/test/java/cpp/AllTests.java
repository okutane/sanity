package cpp;

import junit.framework.TestSuite;

/**
 * @author <a href="mailto:dmitriy.matveev@corp.mail.ru">Dmitriy Matveev</a>
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("All");

        suite.addTest(ParserTests.suite());
        suite.addTest(CallsMapTests.suite());
        suite.addTest(SimulatorTests.suite());
        suite.addTest(RuleTests.suite());

        return suite;
    }
}