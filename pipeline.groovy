def call(param) {
  pipeline {
        agent any
        stages {
          stage('DOING ECHO') {
            steps {
          sh "echo 'AHIHI'"
            }
          }
          stage('DOING AHAHA') {
            steps {
          sh "echo 'AHAHA'"
            }
          }
        }
  }
}
return this
