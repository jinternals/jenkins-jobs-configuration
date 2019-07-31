
@Library("jenkins-demo-shared-libraries") _

gitPullRequestPipeline(name: 'some-name'
                       gitBranch: "{gitBranch}",
                       gitCredentialId: "github",
                       gitRepository: "{gitRepository}")
