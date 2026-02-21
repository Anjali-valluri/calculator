pipeline {
agent any
stages {
stage('clone') {
steps {
git branch:'main', url: ’https://github.com/Anjali-valluri/calculator.git';
}
}
stage('compile') {
steps {
sh 'javac Calculator.java'
}
}
stage('build') {
steps {
sh 'java Calculator 10 5'
  
}
}
  stage('testing') {
steps {
sh 'java Calculator -30 5'
}
}
  stage('Deploy') {
steps {
echo 'Deploymenet completed'
}
}
}
}
