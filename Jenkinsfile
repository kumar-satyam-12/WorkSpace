pipeline{
  agent any
  tools{
    Maven 'MAVEN_HOME'
  }
  stages{
    stage('Welcome Stage'){
      steps{
        echo 'Welcome to Pipeline'
      }
    }

    stage('Clean Stage'){
      steps{
        bat 'mvn clean'
      }
    }

    stage ('Build Stage'){
    steps{
      bat 'mvn install'
    }
  }

  stage('Build Success'){
  steps{
    echo 'Built Successfully'
  }
  }
  }
}
