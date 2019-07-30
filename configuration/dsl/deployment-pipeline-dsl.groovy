@Library("jenkins-demo-shared-libraries") _

deploymentPipeline(
    name: "{name}",
    email: "pandeymradul@gmail.com",
    configCredentialId: "github",
    configBranch: "{configBranch}",
    configRepository: "{configRepository}",
    dockerCredentialId: "dockerhub",
    environment: "{environment}",
    dockerRegistry: "https://index.docker.io/v1/",
    dockerRepository: "{dockerRepository}"
)
