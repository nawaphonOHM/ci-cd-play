

stage('Test') {
    echo "Hello World";
}

// stage('Test nodejs node') {
//     node('nodejs') {
//         checkout([
//                 $class: 'GitSCM', 
//                 branches: [[name: '*/main']], 
//                 userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
//             ])

//         runNode();
        
//     }
// }

stage('Test python3 node') {
    node('python3') {
        checkout([
                $class: 'GitSCM', 
                branches: [[name: '*/main']], 
                userRemoteConfigs: [[url: 'git@github.com:nawaphonOHM/ci-cd-play.git']]
            ])

        runPython();
    }
}

def runNode() {
    sh(script: "node hello_world.js");
}

def runPython() {
    sh(script: "pip install --requirement requirements.txt --target ${WORKSPACE}");
}