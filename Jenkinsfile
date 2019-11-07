pipeline {
    agent any

    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }

    stages {
        stage ('Initialize'){
            steps{
                echo 'Initializing...'
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Unit Tests'){
            steps{
                echo 'Running Unit Tests'
            }
        }
        stage ('Build'){
            steps{
                echo 'Build'
            }
        }
        stage ('Deploy'){
            steps{
                echo 'Deploying'
            }
        }
    }
}


