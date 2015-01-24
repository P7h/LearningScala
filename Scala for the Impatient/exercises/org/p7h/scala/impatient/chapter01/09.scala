// 9. How do you get the first character of a string in Scala? The last character?

val title = "Scala for the Impatient"

// Java
title(0)
title(title.length - 1)

//Scala
title.head
title.take(1)
title.dropRight(title.length - 1)

title.tail(title.length-2)
title.drop(title.length - 1)
title.takeRight(1)

/*

scala> val title = "Scala for the Impatient"
title: String = Scala for the Impatient

scala> title(0)
res26: Char = S

scala> title(title.length - 1)
res27: Char = t

scala>

scala> title.head
res28: Char = S

scala> title.take(1)
res29: String = S

scala> title.dropRight(title.length - 1)
res30: String = S

scala>

scala> title.drop(title.length - 1)
res31: String = t

scala> title.takeRight(1)
res32: String = t

scala> title.tail(title.length-2)
res33: String = t

*/