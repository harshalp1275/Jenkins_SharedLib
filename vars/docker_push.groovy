def call(String projectName, String imageTag, String dockerHubUser) {
  withCredentials([usernamePassword(credentialsId: 'DockerHubcred', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
    sh "echo ${DOCKER_PASS} | docker login -u ${DOCKER_USER} --password-stdin"
    sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
    sh "docker logout"
  }
}
