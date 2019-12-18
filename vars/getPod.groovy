def call(String cYaml) {
  
  def podYaml = """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.3.9-jdk-8-alpine
    command: ['cat']
    tty: true
    ${cYaml}
"""
  return podYaml.toString()
}
