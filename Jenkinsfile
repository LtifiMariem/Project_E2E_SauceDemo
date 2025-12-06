pipeline {
    agent any

    triggers {
        // Exécuter toutes les 5 minutes
        cron('H/5 * * * *')
    }

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/LtifiMariem/Project_E2E_SauceDemo.git',
                    branch: 'main',
                    credentialsId: 'github-token'
            }
        }

        stage('Build') {
            steps {
                bat "mvn clean install -DskipTests"
            }
        }

        stage('Run Tests') {
            steps {
                bat "mvn clean test"
            }
        }

        stage('Generate Allure Report') {
            steps {
                allure includeProperties: false, results: [[path: 'target/allure-results']]
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/allure-results/**', fingerprint: true
            cleanWs()
        }
    }
}
