def call( Map map = [:]){

    String agentName = map.agentName ?: 'cicd-agent'
    List projectClusterName = map.projectClusterName ?: []
    String buildTimeout = map.buildTimeout ?: '1'

    if (projectClusterName == []) {
        switch(projectEnv) {
        case ["dev", "qc", "merchant", "functest"]:
            projectClusterName = ['zlp-k8s-dev-1']
            break
        case "loadtest":
            projectClusterName = [ 'k8s-loadtest-zalopay' ]
            break
        case ["staging", "production"]:
            projectClusterName = ['zlp-k8s-prod-1','zlp-k8s-prod-2']
            break
        case ["drsite"]:
            projectClusterName = ['zlp-k8s-drsite-1']
            break
        }
    }

    pipeline {

        options {
            gitLabConnection('gitlab.zalopay.vn-k8s')
            disableConcurrentBuilds()
            ansiColor('xterm')
            timeout(time: buildTimeout, unit: 'HOURS')
            buildDiscarder(logRotator(daysToKeepStr: '30')) 
        }

        agent {
            label "${agentName}"
        }

        environment {
            trackingProxy = false
            NPM_TOKEN = credentials('kaniko_verdaccio_password')
            NACOS_DEV_PASSWORD = credentials('nacos_dev_password')
            NACOS_QC_PASSWORD = credentials('nacos_qc_password')
            NACOS_FUNCTEST_PASSWORD = credentials('nacos_functest_password')
            NACOS_MC_PASSWORD = credentials('nacos_mc_password')
            NACOS_STG_PASSWORD = credentials('nacos_stg_password')
            NACOS_PROD_PASSWORD = credentials('nacos_prod_password')
            NACOS_DRSITE_PASSWORD = credentials('nacos_drsite_password')
            NACOS_LT_PASSWORD = credentials('nacos_lt_password')
            GO_DEPENDENCIES_CICD_TOKEN = credentials('go_dependencies_cicd_token')
            SONAR_TOKEN = credentials('sonar_token')
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
