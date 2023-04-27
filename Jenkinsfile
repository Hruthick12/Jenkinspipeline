@Library('MyLibrary') _
pipeline {
    agent any
    tools{
        maven "Maven"
    }
    stages {
        
        stage('Hello World') {
            steps {
                script 
                {
                    helloworld.hello()
                }
            }
        }
                stage('Checkout code from the Git') {
            steps {
                script
                {
                 checkout_git.checkout_git("java-hello-world-with-maven")
                }
            }
                }
            stage('triggering aws code build') {
            steps {
                dir("java-hello-world-with-maven")
                {
                script 
                {
                    aws_codebuild.aws_codebuild("java-project")
                }
                }
            }
        }
}
}


