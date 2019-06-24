def call(Map config) {
    node {
        echo "hello ${config.name}"
    }
}
