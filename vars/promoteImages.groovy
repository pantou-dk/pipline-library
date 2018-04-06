def call(String fromProject, String toProject) {
    openshift.withCluster() {
        def images = '';
        openshift.withProject(fromProject) {
            images = openshift.selector('is', ['promote': 'true']).freeze()
        }
        openshift.withProject(toProject) {
            images.withEach {
                openshift.tag(fromProject + '/' + it.name().substring(13) + ':latest', it.name().substring(13) + ':latest')
            }
        }
    }
}