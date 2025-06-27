#!/usr/bin/env groovy

def call(String imageName) {
    if (!imageName?.trim()) {
        error "Image name must be provided to dockerPush"
    }
    echo "Pushing Docker image: ${imageName}"
    sh "docker push ${imageName}"
}
