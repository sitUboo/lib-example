def call(start_time, end_time) {
   try{
     def sDate = new Date().parse('dd.MM.yyyy HH:mm:ss',start_time)
     def eDate = new Date().parse('dd.MM.yyyy HH:mm:ss',end_time)
   }catch(Exception e){
     return false
   }
   return true
}
