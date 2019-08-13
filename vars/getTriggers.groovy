def call(trigger_cause) {
   echo "Evaluating trigger_cause: " + trigger_cause
   
   echo trigger_cause.repository.name
  // trigger_cause.each {
  //    echo "Trigger event: $it"
  // }
   //env["lunch"] = "brussels sprouts"
   env["lunch"] = "candy"
}
