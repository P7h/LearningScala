// 8. One way to create random file or directory names is to produce a random BigInt and convert it to base 36, yielding a string such as  "qsnvbevtomcj38o06kul". Poke around Scaladoc to find a way of doing this in Scala.


import BigInt._
import scala.util.Random

val fileName = BigInt(75, Random)  toString 36

probablePrime(75, Random) toString 36


/*

scala> val fileName = BigInt(75, Random)  toString 36
fileName: String = sildgf0ue9nbzw


scala> probablePrime(75, Random) toString 36
res40: String = 46ggql8i4ti3r6p

*/