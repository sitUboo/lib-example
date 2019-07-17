def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it"
   }
   env.lunch = "brussels sprouts"
   return env
}
