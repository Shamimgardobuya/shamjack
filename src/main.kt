fun main(){
    mega(32,34)
    someOne(12)
    people(names= arrayOf("John","Maggie","Lambda","James"))
   vowels(args = arrayOf('a','e','o','u'))

}
fun mega(a:Int,b:Int){
    var sum = a+b
    println(sum)
}
fun someOne(y:Int){
    var square = y *y
    println(square)


    }
fun people(names:Array<String>){
    println(names.contentToString())
    }
fun sime(args:Array<String>){
    val args = 'c'
    println(args.toString())
}
fun vowels(args:Array<Char>) {
    var args = arrayOf('a','e','i','o','u')
    args.forEach { ml->
        println(ml.toString())
    }


}




