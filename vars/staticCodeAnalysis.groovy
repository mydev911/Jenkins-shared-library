
def call(credentialsId) {
    //println("Using SonarQube credentials ID: ${credentialsId}")
    withSonarQubeEnv(credentialsId: credentialsId) {
        // some block
        sh 'mvn clean package sonar:sonar'
    }   
}
