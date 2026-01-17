pipeline {
    agent any
    stages {

        stage('Checkout') {
            steps {
                echo 'Cloning repository...'
                git branch: 'main', url: 'https://github.com/J-Gokul23/Learning-CI-CD-And-Testing-.git'
            }
        }
        stage('Build with Maven') {
            steps {
                echo 'Building the project with Maven...'
                bat 'mvn clean package -DskipTests'
            }
        }
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t cicd:latest .'
            }
        }
        stage('Stop Old Container (if any)') {
            steps {
                echo 'Stopping old container if it exists...'
                bat '''
                docker stop cicdapp || exit 0
                docker rm cicdapp || exit 0
                '''
            }
        }
        stage('Run Docker Container') {
            steps {
                echo 'Running new container...'
                bat 'docker run -d -p 8081:8081 --name cicdapp cicd:latest'
            }
        }
    }
    post {
        success {
            echo '✅ Build and deployment completed successfully!'
        }
        failure {
            echo '❌ Build failed. Check logs for errors.'
        }
    }
}

