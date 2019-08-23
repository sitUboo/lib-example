node {
    checkout scm
    sh "ls -l;git status"
    echo "Our variables: ${GIT_COMMIT} , ${scm.extensions} , ${scm.userRemoteConfigs.credentialsId}"
}
