@Library('MyLibrary') _
pipeline {
    agent any
    tools {
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

        stage('Checkout code from Git.') {
            steps {
                parallel{
                    "1": {dir("dir1"){script {checkout_git.checkout_git("java-hello-world-with-maven")}}}
               // dir("dir2") {checkout_git.checkout_git("mycoderepo")}

                           }
                        }
                  }                               
        
        stage('Trigger AWS Code Build') {
            steps {
                dir("dir1")
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
