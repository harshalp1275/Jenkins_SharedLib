def call(String repoUrl, String branch) {
  checkout([
    $class: 'GitSCM',
    branches: [[name: branch]],
    doGenerateSubmoduleConfigurations: false,
    extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: '.']],
    userRemoteConfigs: [[url: repoUrl]]
  ])
}
