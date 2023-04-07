def call(credentialsId) {
    withSonarQubeEnv(credentialsId: 'credentialsId') {
    // some block
    sh 'mvn clean package sonar:sonar'
    }   
}