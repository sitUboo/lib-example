def call(my_time) {
   try{
     def myDate = new Date().parse('dd.MM.yyyy HH:mm:ss',my_time)
   }catch(Exception e){
     return false
   }
   return true
}
