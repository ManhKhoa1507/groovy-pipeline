def call(param){
    pipeline {
        environment {
            trackingProxy = false
        }

        stage {
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
