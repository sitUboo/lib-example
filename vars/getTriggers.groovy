def call(trigger_cause) {
   trigger_cause.each {
      echo "Trigger event: $it.event.event"
      str = it.event.event
      def x[] = str.split(":")
      echo "Bits $x[0] and $x[1]"
   }
   env.lunch = "brussels sprouts"
   return env
}
