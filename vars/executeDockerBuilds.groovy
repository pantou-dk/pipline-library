def call(String projectName) {
    openshift.withCluster() {
        openshift.withProject(projectName) {
            openshift.selector('bc').startBuild('--from-dir=.').withEach {
                it.logs('-f')
                openshift.failUnless(it.status == 0)
            }
        }
    }
}