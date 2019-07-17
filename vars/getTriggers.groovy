def call(trigger_cause) {
   echo "My trigger cause: ${trigger_cause}"
   echo "Event Key: ${trigger_cause[0].event}"
   echo "We had a total of ${trigger_cause.size()}"
   def ourCount = trigger_cause.size()
   return ourCount
}
