def call(String imageName) {
    if (!imageName?.trim()) {
        error "Image name must be provided to buildImage"
    }
    echo "Building the Docker image: ${imageName}"
    sh "docker build -t ${imageName} ."
}