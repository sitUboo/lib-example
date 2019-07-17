def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it.event.event"
      myEvent = "$it.event.event"
      bits = myEvent.split(":")
      //str = it.event.event
      //x = str.split(",")
      //x = "$it.event.event.split(':')"
      echo "Bits $bits[0] and $bits[1]"
   }
   env.lunch = "brussels sprouts"
   return env
}
