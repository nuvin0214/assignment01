object caesarcipher extends App
{

  val Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encryption=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

  val Decryption=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)

  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

 //println(alphabet.indexOf('Y'))
 // println(alphabet.size)

  val data1=cipher(Encryption,"pqrst",6,Alphabet)
  val data2=cipher(Decryption,"wx",1,Alphabet)
  println(data1)
  println(data2)

}