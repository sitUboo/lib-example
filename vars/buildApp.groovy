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
                    config.each { key, val ->
                        println "my Key: $key Value: $val"
                    }
                    env.each { key, val ->
                        println "Env Key: $key Value: $val"
                    }
                    deleteDir()
                }
            }
         }
       }
    }
}
