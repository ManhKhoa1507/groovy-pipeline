@Library("my-shared-library") _
pipeline {
    agent any
    stages {
        stage ('Example') {
            steps {
                helloWorld()
                sh "ls"
                sh "touch logs"
                sh "cat logs"
            }
        }
    }
}