pipeline {
    agent any

    stages {
        stage('Test Jobs Configuration') {
            steps {
                sh 'jenkins-jobs test -r ./configuration'
            }
        }
         stage('Apply Jobs Configuration') {
                    steps {
                        sh 'jenkins-jobs update --delete-old -r ./configuration'
                    }
         }
    }
}