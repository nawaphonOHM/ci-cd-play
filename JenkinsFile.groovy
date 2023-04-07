

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

        runNode();
        // sh(script: "python3 hello_world.py");
        
    }
}

stage('Test python3 node') {
    node('python3') {
        checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])
        runPython();
        // sh(script: "node hello_world.js");
    }
}

def runNode() {
    sh(script: "node hello_world.js");
}

def runPython() {
    sh(script: "python3 hello_world.py");
}