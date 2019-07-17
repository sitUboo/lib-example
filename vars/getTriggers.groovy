def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it.event.event"
   }
   //env.lunch = "brussels sprouts"
   env["lunch"] = "candy"
}
