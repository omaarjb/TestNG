pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'YOUR_REPO_URL'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
