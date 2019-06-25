def call(Map config) {
    pipeline {
       agent {
         label "${config.agent}"
       }

       options {
          buildDiscarder(logRotator(numToKeepStr: "5"))
          timeout(time: 15, unit: 'MINUTES')
       }
        
       stages{
         stage('Stage A'){
            steps{
                script{
                    deleteDir()
                }
            }
         }
       }
    }
}