def call(Map config) {
    def myVar = 'test'
    pipeline {
       agent {
         label "linux"
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
