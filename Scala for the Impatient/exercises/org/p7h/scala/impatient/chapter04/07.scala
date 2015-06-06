// 7. Print a table of all Java properties, like this:

/*
java.runtime.name       | Java(TM) SE Runtime Environment
sun.boot.library.path   | /home/apps/jdk1.6.0_21/jre/lib/i386
java.vm.version         | 17.0-b16
java.vm.vendor          | Sun Microsystems Inc.
java.vendor.url         | http://java.sun.com/
path.separator          | :
java.vm.name            | Java HotSpot(TM) Server VM
*/

// ---------------- 1st solution --------------------- //

import scala.collection.JavaConversions.propertiesAsScalaMap

val properties = propertiesAsScalaMap (System.getProperties)
val keyMaxLength = properties.keySet.toList.sortWith(_ > _).maxBy(_.size)
for ((key, value) <- properties) {
    println(key + " " * ((keyMaxLength.size) - (key size)) + " | " + value)
}

// ---------------- 2nd solution --------------------- //

import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.immutable.ListMap

val properties = propertiesAsScalaMap (System.getProperties)
val props = ListMap(properties.toSeq.sortBy(_._1):_*)
val keyMaxLength = props.keySet.toList.sortWith(_ > _).maxBy(_.size)
for ((key, value) <- props) {
    println(key + " " * ((keyMaxLength.size) - (key size)) + " | " + value)
}

// ---------------- 3rd solution --------------------- //

import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.immutable.TreeMap

val properties = propertiesAsScalaMap (System.getProperties)
val treeMap = TreeMap(properties.toSeq:_*)
val keyMaxLength = treeMap.keySet.toList.sortWith(_ > _).maxBy(_.size)
for ((key, value) <- treeMap) {
    println(key + " " * ((keyMaxLength.size) - (key size)) + " | " + value)
}