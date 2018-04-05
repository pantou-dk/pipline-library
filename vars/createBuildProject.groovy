def call() {
    openshift.withCluster() {
        openshift.newProject(getProjectName())
        def sshKey = libraryResource 'com/pantou/build/pipeline/ssh-secret.yaml'
        openshift.withProject(getProjectName()) {
            openshift.apply(sshKey)
        }
    }
}
