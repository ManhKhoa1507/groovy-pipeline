pipeline {
    agent any
    stages {
        stage ('ECHO AHIHI') {
            steps {
                sh 'echo "Ahihi"'
            }
        }
    }
}