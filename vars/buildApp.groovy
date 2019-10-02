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
                    def foundFiles = findFiles(glob: '*.txt')
                    env.FILE_TO_TEST = input message: 'User input required', ok: 'Input File',
                            parameters: [choice(name: 'FILE_TO_TEST', choices: foundFiles, description: 'What file to use?')]
                    echo "${env.FILE_TO_TEST}"
                    //deleteDir()
                }
            }
         }
       }
    }
}
