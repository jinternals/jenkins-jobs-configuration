@Library("jenkins-demo-shared-libraries") _

domainPipeline(
        gitBranch: "{gitBranch}",
        gitCredentialId: "github",
        gitRepository: "{gitRepository}",
        email: "pandeymradul@gmail.com",
        dockerCredentialId: "dockerhub",
        dockerRegistry: "https://index.docker.io/v1/",
        dockerRepository: "{dockerRepository}"
)