def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it.event.event"
      def myEvent = "$it.event.event"
      echo myEvent
      myArray = myEvent.split(':')
      //str = it.event.event
      //x = str.split(",")
      //x = "$it.event.event.split(':')"
      echo "Bits $myArray[0] and $myArray[1]"
   }
   env.lunch = "brussels sprouts"
   return env
}
