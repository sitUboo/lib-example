def call(Map config) {
    pipeline {
       agent any

       options {
          buildDiscarder(logRotator(numToKeepStr: "5"))
          timeout(time: 15, unit: 'MINUTES')
       }
        
       stages{
         stage('Stage A'){
            steps{
                script{
                    git 'git@github.com:sitUboo/choices.git'
                    deleteDir()
                }
            }
         }
       }
    }
}
