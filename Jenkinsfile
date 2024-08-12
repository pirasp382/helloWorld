pipeline {
    agent any

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
}
