def call(Map config) {
  
  def podYaml = """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.3.9-jdk-8-alpine
    command: ['cat']
    tty: true
  - name: ${config.name}
    image: ${config.image}
    command: ['${config.command}']
    tty: ${config.tty}
"""
  return podYaml.toString()
}
