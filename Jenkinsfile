def project_path = ""
pipeline {
    agent any
    tools {
        jdk 'jdk11'
        maven 'maven3'
    }
    stages {
        stage('Test java installation') {
            steps {
                sh 'java -version'
                sh 'which java'
            }
        }
        stage('Test maven installation') {
            steps {
                sh 'mvn -version'
                sh 'which mvn'
            }
        }
        stage('Clone repo from Git') {
            steps{
                git 'https://github.com/bbarryyim/spring_person.git'
            }
        }
        stage('Compile and Package'){
            steps{
                dir(project_path) {
                    sh 'mvn clean compile package'
                }
            }
        }
        stage('Post'){
            steps{
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}