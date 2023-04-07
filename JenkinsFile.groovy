

stage('Test') {
    echo "Hello World";
}

stage('Test nodejs node') {
    node('nodejs') {
        steps ("Clone Project") {
            checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])
        }

        steps ("Run build command") {
            runNode();
        }
        
    }
}

stage('Test python3 node') {
    node('python3') {
        steps ("Clone Project") {
            checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])
        }

        steps ("Run build command") {
            runPython();
        }
    }
}

def runNode() {
    sh(script: "node hello_world.js");
}

def runPython() {
    sh(script: "python3 hello_world.py");
}