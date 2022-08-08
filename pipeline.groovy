def call(param) {
  pipeline {
        agent any
        stages {
          stage('DOING ECHO') {
            steps {
          echo 'AHIHI'
            }
          }
          stage('DOING AHAHA') {
            steps {
              script {
                echo 'AHAHA'
              }
            }
          }
        }
  }
}
return this
