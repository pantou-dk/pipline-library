def call(String projectName, String prefix = '') {
    createKubernetesObjectsByType(projectName, 'builds', prefix)
}