def call(trigger_cause) {
   trigger_cause.each {
      def s = it.event
      echo s
      def x = s.split(":")
      env[x[0]] = x[1]
   }
      //env.lunch = candy
   return env
}
