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
                   dir("dir") {checkout_git.checkout_git("java-hello-world-with-maven")}
                }
            }
                }
                stage('Maven Build') {
            steps {
                script 
                {
                   dir("dir") {maven_build.maven_build()}
                }
            }

    }
}
}

