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
                parallel(
                    "1": {dir("dir1"){script {checkout_git.checkout_git("java-hello-world-with-maven")}}},
                    "2": {dir("dir2"){script {checkout_git.checkout_git("simple-java-maven-app")}}}

                )
                        }
                  }                               
        
        stage('Trigger AWS Code Build') {
            steps {
                /**dir("dir1")
                {
                script 
                {
                      aws_codebuild.aws_codebuild("java-project")
                }
                }**/
                parallel(
                "1": {dir("dir1"){script {aws_codebuild.aws_codebuild("java-project", "us-east-2")}}},
                "2": {dir("dir2"){script {aws_codebuild.aws_codebuild("java-project1", "us-east-2")}}}
                )
            }
        }
    }
}
