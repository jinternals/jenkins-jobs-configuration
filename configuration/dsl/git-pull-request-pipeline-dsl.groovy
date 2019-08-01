
@Library("jenkins-demo-shared-libraries") _

gitPullRequestPipeline(name: '{name}',
                       gitBranch: "{gitBranch}",
                       gitCredentialId: "github",
                       gitRepository: "{gitRepository}",         
                       sonarOrganization: "{sonarOrganization}",
                       sonarProjectKey: "{sonarProjectKey}")

