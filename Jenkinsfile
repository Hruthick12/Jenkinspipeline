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
                {
                    script {
                        	dir("dir1") {checkout_git.checkout_git("java-hello-world-with-maven")}
               // dir("dir2") {checkout_git.checkout_git("mycoderepo")}

                           }
                        }
                  }                                
            }
        
        
        stage('triggering aws code build.') {
            steps {
                dir("dir1")
                {
                script 
                {
                    aws_codebuild.aws_codebuild("java-project,us-east-2")
                }
                }
            }
        }
    }
    }                
        
