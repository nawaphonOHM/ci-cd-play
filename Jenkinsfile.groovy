

stage('Test') {
    echo "Hello World";
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