pipeline{
    agent any
    tools{
        maven 'maven 3.9.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '41232283-f2cc-40da-8b00-9411209d99b5', url: 'https://github.com/shahnawaz1711/sprmvn.git']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t shahnawaz786/sprmvn .'
                }
            }
        }
        stage('Push Image to Docker Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'my-id-any', variable: 'dockerPass')]) {
                        bat 'docker login -u shahnawaz786 -p %dockerPass%'
                        
                        bat 'docker push shahnawaz786/sprmvn'
                    }
                }
            }
        }
    }
}