def call() {
    return env.BUILD_TAG.substring(18).toLowerCase()
}
