pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/omaarjb/TestNG.git'
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
