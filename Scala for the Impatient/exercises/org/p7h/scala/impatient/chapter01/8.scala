// 8. One way to create random file or directory names is to produce a random BigInt and convert it to base 36, yielding a string such as  "qsnvbevtomcj38o06kul". Poke around Scaladoc to find a way of doing this in Scala.


import scala.util.Random

val fileName = BigInt(75, Random)  toString 36


/*

scala> import scala.util.Random
import scala.util.Random

scala> val fileName = BigInt(75, Random)  toString 36
fileName: String = 5s23vgkaxq19awo

*/