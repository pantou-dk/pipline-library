def call(String projectName, String prefix = '') {
    createKubernetesObjectsByType(projectName, 'images', prefix)
}