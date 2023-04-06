

stage('Test') {
    echo "Hello World";
}

stage('Test nodejs node') {
    node('nodejs') {
        checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])
        echo "Hello World from nodejs"
        
    }
}

stage('Test python3 node') {
    node('python3') {
        checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])
        echo "Hello World form python3"
    }
}