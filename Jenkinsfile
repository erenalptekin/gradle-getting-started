node {
   stage('Preparation') {
      git 'https://github.com/erenalptekin/gradle-getting-started.git'
   }
   stage('Build') {
       if (isUnix()) {
           sh "./gradlew clean test"
       } else {
           bat "./gradlew clean test"
       }
   }
   stage('Deploy') {
        sh "git push https://heroku.com/frozen-ravine-80863.git master"
   }
}