def call(){
  dependecyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
  dependecyCheckPublisher pattern: '**/dependency-check-report.xml'
}
