def call(String projectName) {
    openshift.withCluster() {
        openshift.newProject(projectName)
    }
}
