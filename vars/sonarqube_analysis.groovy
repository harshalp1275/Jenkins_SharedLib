def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv("${SonarQubeAPI}"){
      def scannerHome = tool 'SonarScanner'
sh """
    ${scannerHome}/bin/sonar-scanner \
    -Dsonar.projectName=${Projectname} \
    -Dsonar.projectKey=${ProjectKey} \
    -X
"""
  }
}
