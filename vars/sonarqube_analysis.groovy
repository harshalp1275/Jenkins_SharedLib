def call(String SonarQubeAPI, String Projectname, String ProjectKey) {
  def scannerHome = tool 'SonarScanner'
  withSonarQubeEnv("${SonarQubeAPI}") {
    sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey}"
  }
}
