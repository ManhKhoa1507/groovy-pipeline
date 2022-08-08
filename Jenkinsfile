@Library("my-shared-library") _
pipeline {
    agent any
    stages {
        stage ('Example') {
            steps {
                sh "touch logs"
                helloWorld()
                sh "ls"
                sh "cat logs"
            }
        }
    }
}