@Library("jenkins-demo-shared-libraries") _

libraryPipeline(
        name: "{name}",
        gitBranch: "{gitBranch}",
        gitCredentialId: "github",
        gitRepository: "{gitRepository}",
        email: "pandeymradul@gmail.com"
)
