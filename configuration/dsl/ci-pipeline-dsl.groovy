@Library("jenkins-demo-shared-libraries") _

ciPipeline(
    name: "{name}",
    email: "pandeymradul@gmail.com",
    configBranch: "{configBranch}",
    configRepository: "{configRepository}"
    dockerCredentialId: "dockerhub",
    dockerRegistry: "https://index.docker.io/v1/",
    dockerRepository: "{dockerRepository}"
)
