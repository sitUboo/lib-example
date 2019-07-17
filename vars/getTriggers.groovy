def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it.event.event"
      //str = it.event.event
      //x = str.split(",")
      x = "$it.event.event.split(':')"
      echo "Bits $x[0] and $x[1]"
   }
   env.lunch = "brussels sprouts"
   return env
}
