package com.pods

def getMavenPodDef() {
  def podYaml = """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.3.9-jdk-8-alpine
    command: ['cat']
    tty: true
"""
  return podYaml
}
