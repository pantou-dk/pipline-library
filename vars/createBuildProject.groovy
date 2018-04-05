def call() {
    openshift.withCluster() {
        openshift.newProject(getProjectName())
    }
}
