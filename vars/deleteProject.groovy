def call(String projectName) {
    openshift.withCluster() {
        openshift.delete('project', projectName)
    }
}