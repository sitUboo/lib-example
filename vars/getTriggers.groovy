def call(trigger_cause) {
   trigger_cause.each {
      echo it
   }
   env.lunch = "brussels sprouts"
   return env
}
