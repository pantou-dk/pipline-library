def call(String projectName, String prefix = '') {
    createKubernetesImageObjects(projectName, prefix)
    createKubernetesBuildObjects(projectName, prefix)
}