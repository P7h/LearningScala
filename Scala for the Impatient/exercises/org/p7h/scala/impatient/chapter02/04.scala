// 4. Write a Scala equivalent for the Java loop for (int i = 10; i >= 0; i--) System.out.println(i);

for (n <- Range(10, -1, -1)) println(n)


/*

scala> for (n <- Range(10, 0, -1)) println(n)
10
9
8
7
6
5
4
3
2
1
0

*/