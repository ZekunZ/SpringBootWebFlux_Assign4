pipeline {
    agent any
    environment {
       DOCKERHUB_PWD=credentials('CredentialID_DockerHub_PWD')
    }
    stages {
        stage('Maven Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ZekunZ/SpringBootWebFlux_Assign4.git']])
                sh './mvnw -B -DskipTests clean package'
            }
        }
        stage('Maven Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Docker Build') {
        	agent any
            steps {
          	    sh 'docker build -t zekunz/springbootwebflux_assign4:latest .'
            }
        }
        stage('Docker Login and Push') {
            agent any
            steps {
                sh "docker login -u zekunz -p ${DOCKERHUB_PWD}"
                
                sh 'docker push zekunz/springbootwebflux_assign4:latest'
            }
        }
        stage('Deploy to Dev') {
            steps {
                sh 'echo deploy to dev'
            }
        }
        stage('Deploy to QAT') {
            steps {
                sh 'echo deploy to QAT'
            }
        }
        stage('Deploy to Staging') {
            steps {
                sh 'echo deploy to staging'
            }
        }
        stage('Deploy to Prod') {
            steps {
                sh 'echo deploy to prod'
            }
        }
    }
}