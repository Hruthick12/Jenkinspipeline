def aws_codebuild(String project) {
        echo "triggering aws code build."
        awsCodeBuild artifactEncryptionDisabledOverride: '', artifactLocationOverride: '', artifactNameOverride: '', artifactNamespaceOverride: '', artifactPackagingOverride: '', artifactPathOverride: '', artifactTypeOverride: '', awsAccessKey: '', awsSecretKey: '', buildSpecFile: '', buildTimeoutOverride: '', cacheLocationOverride: '', cacheModesOverride: '', cacheTypeOverride: '', certificateOverride: '', cloudWatchLogsGroupNameOverride: '', cloudWatchLogsStatusOverride: '', cloudWatchLogsStreamNameOverride: '', computeTypeOverride: '', credentialsId: 'awscodebuild', credentialsType: 'jenkins', cwlStreamingDisabled: '', downloadArtifacts: 'false', downloadArtifactsRelativePath: '', envParameters: '', envVariables: '', environmentTypeOverride: '', exceptionFailureMode: '', gitCloneDepthOverride: '', imageOverride: '', insecureSslOverride: '', localSourcePath: '', overrideArtifactName: '', privilegedModeOverride: '', projectName: 'java-project', proxyHost: '', proxyPort: '', region: 'us-east-2', reportBuildStatusOverride: '', s3LogsEncryptionDisabledOverride: '', s3LogsLocationOverride: '', s3LogsStatusOverride: '', secondaryArtifactsOverride: '', secondarySourcesOverride: '', secondarySourcesVersionOverride: '', serviceRoleOverride: '', sourceControlType: 'jenkins', sourceLocationOverride: '', sourceTypeOverride: '', sourceVersion: '', sseAlgorithm: '', workspaceExcludes: '', workspaceIncludes: '', workspaceSubdir: ''
}
return this
