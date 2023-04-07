

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

        echo sh(script: "node hello_world.js");
        
    }
}

stage('Test python3 node') {
    node('python3') {
        checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])
        echo sh(script: "python3 hello_world.py");
    }
}