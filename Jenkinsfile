pipeline {
    agent none
    stages {
        stage('Test') {
            parallel {
                stage('Test on OSX') {
                    agent {
                        label 'osx'
                    }
                    steps {
                        testOsx('parser-native')
                        
                        containerId = sh(returnStdout: true, script: 'docker run -d -p 8080:8080 sanitytool/bitreader-service').trim()
                        testOsx('parser-remote')
                        sh "docker stop $containerId"
                    }
                    post {
                        always {
                            junit 'tests/target/surefire-reports/**/*.xml'
                        }
                        cleanup {
                            cleanWs()
                        }
                    }
                }
                stage('Test on Win32') {
                    agent {
                        label 'win32'
                    }
                    steps {
                        containerId = powershell returnStdout: true, script: 'docker run -d -p 8080:8080 sanitytool/bitreader-service'
                        testWin32('parser-remote')
                        powershell "docker stop $containerId"
                    }
                    post {
                        always {
                            junit 'tests/target/surefire-reports/**/*.xml'
                        }
                    }
                }
            }
        }
    }
    tools {
        maven 'Maven 3.3.9'
        jdk '1.8'
    }
}

def testOsx(profile) {
    testClang('clang', profile)
    testClang('/usr/local/opt/llvm/bin/clang', profile)
    testClang('clang-3.3', profile)
    testClang('clang-3.6', profile)
    testClang('clang-3.7', profile)
    testClang('clang-3.8', profile)
    testClang('/usr/local/opt/llvm@4/bin/clang-4.0', profile)
    testClang('/usr/local/opt/llvm@5/bin/clang-5.0', profile)

    testRust('rustc', profile)
    testRust("$env.HOME/.cargo/bin/rustc", profile)
}

def testWin32(profile) {
    testClang('C:\\Program Files\\LLVM\\bin\\clang.exe', profile)
}

def testClang(clangBin, profile) {
    sh "CLANG_BIN=$clangBin mvn test -P $profile"
}

def testRust(rustBin, profile) {
    sh "RUST_BIN=$rustBin mvn test -P $profile"
}
