def call(String sonarToolName, String sonarServerName, String projectKey, String projectName) {
  def scannerHome = tool name: sonarToolName, type: 'hudson.plugins.sonar.SonarRunnerInstallation'
  withSonarQubeEnv(sonarServerName) {
    sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName} -Dsonar.sources=."
  }
}
