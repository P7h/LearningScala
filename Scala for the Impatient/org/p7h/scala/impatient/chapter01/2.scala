// 2. In the Scala REPL, compute the square root of 3, and then square that value. By how much does the result differ from 3? (Hint: The  res variables are your friend.)


val sqroot_sq = math.pow(math.sqrt(3), 2)
val diff = 3 - sqroot_sq
println(diff)


/*

scala> val sqroot_sq = math.pow(math.sqrt(3), 2)
sqroot_sq: Double = 2.9999999999999996

scala> val diff = 3 - sqroot_sq
diff: Double = 4.440892098500626E-16

scala> println(diff)
4.440892098500626E-16

*/