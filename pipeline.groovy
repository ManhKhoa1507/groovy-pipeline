def call( Map map = [:]){

    pipeline {

        options {
        }

        agent any

        environment {
            trackingProxy = false
        }
        
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
return this;
