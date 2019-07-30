@Library("jenkins-demo-shared-libraries") _

starterPipeline(
        name: "{name}",
        gitBranch: "{gitBranch}",
        gitCredentialId: "github",
        gitRepository: "{gitRepository}",
        email: "pandeymradul@gmail.com"
)
