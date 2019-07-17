def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it.event"
   }
   env.lunch = "brussels sprouts"
   return env
}
