

stage('Test') {
    echo "Hello World";

    checkout([$class: 'GitSCM', branches: [[name: '*/main']],
    userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]])
}

stage('Test nodejs node') {
    node('nodejs') {
        echo "Hello World from nodejs"
        
    }
}

stage('Test python3 node') {
    node('python3') {
        echo "Hello World form python3"
    }
}