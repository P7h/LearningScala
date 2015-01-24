// 7. What do you need to import so that you can get a random prime as probablePrime(100, Random) , without any qualifiers before  probablePrime and  Random ?


import BigInt._
import scala.util.Random

probablePrime(100, Random)


/*

scala> import BigInt._
import BigInt._

scala> import scala.util.Random
import scala.util.Random

scala> probablePrime(100, Random)
res20: scala.math.BigInt = 1230706431975767905996600374211

*/