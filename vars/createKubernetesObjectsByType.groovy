def call(String projectName, String objectType, String prefix = '') {
    openshift.withCluster() {
        openshift.withProject(projectName) {
            findFiles(glob: prefix + 'kubernetes/' + objectType + '/*.yaml').each { file ->
                def data = readYaml file: file.path
                openshift.apply(data)
            }
        }
    }
}