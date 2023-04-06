

stage('Test') {
    echo "Hello World";
}

stage('Test nodejs node') {
    node('nodejs') {
        echo "Hello World from nodejs"
    }
}