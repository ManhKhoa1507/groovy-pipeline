@Library("my-shared-library") _
pipeline {
    agent any
    stages {
        stage ('Example') {
            steps {
                sh "ls"
                helloWorld()
            }
        }
    }
}