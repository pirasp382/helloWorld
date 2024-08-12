pipeline {
    agent any

    tools {
        maven 'Maven3'  // Maven Installation Name, die in Jenkins konfiguriert ist
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/pirasp382/helloWorld.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
