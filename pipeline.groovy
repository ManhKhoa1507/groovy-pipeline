def call(param) {
  pipeline {
        agent any
        stages {
          stage('DOING ECHO') {
            steps {
              script {
                echo 'AHIHI'
              }
            }
          }
        }
  }
}
return this
