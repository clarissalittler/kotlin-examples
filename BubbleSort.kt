fun <T> bubbleSort (l : MutableList<T>, c : (T,T) -> Boolean) : MutableList<T> {
   val length = l.size
   var isSorted = false
   while (! isSorted) {
      isSorted = true
      for(i in 0..length-2) {
	 if(c(l[i],l[i+1])){
	    var tmp = l[i+1]
	    l[i+1] = l[i]
	    l[i] = tmp
	    isSorted = false
	 }
      }      
   }
   return l
}

fun main(args : Array<String>){
   var testList = mutableListOf<Int>(4,2,3,1)
   // Here we're going to sort the list from high to low
   // which means that it should flip the two elements when the first is LESS than the second
   bubbleSort(testList,{a , b -> a < b})
   println(testList)
}
