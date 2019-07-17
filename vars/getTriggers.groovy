def call() {
   trigger_cause = currentBuild.getBuildCauses('com.cloudbees.jenkins.plugins.pipeline.events.EventTriggerCause') 
   echo "My trigger cause: ${trigger_cause}"
   echo "Event Key: ${trigger_cause[0].event}"
   echo "We had a total of ${trigger_cause.size()}"
   return trigger_cause.size()
}
