object simple {
  def main(args: Array[String]) {
val array=Array(10,25,30)
   for ( i <- 0 to (array.length - 1) ) {
         if (array(i)%2==0) println(array(i)*2)
         else
           println(array(i)*3)
      }
  }
}
