@Library("jenkins-demo-shared-libraries") _

domainPipeline(
        branch: "{branch}",
        gitUrl: "{gitUrl}",
        email: "pandeymradul@gmail.com",
        dockerCredentialId: "dockerhub",
        dockerRegistry: "https://index.docker.io/v1/",
        dockerRepository: "{dockerRepository}"
)
