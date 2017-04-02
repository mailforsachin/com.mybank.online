pipeline {
    agent any
           
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
          stage('Run myscript') {
            steps {
                
              
    sh('python MyScript.py')

               
               
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
