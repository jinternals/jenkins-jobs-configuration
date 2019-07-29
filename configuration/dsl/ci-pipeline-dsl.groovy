@Library("jenkins-demo-shared-libraries") _

ciPipeline(
    email: "pandeymradul@gmail.com",
    dockerCredentialId: "dockerhub",
    dockerRegistry: "https://index.docker.io/v1/",
    dockerRepository: "{dockerRepository}"
)
