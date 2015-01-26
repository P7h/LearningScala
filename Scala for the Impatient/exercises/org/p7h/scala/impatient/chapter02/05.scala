// 5. Write a procedure  countdown(n: Int) that prints the numbers from n to 0.


def countdown(n: Int) = {
    for( i <- Range(n, -1, -1) )
        println(i)
}

countdown(5);


/*

scala> def countdown(n: Int) = {
     |     for( i <- Range(n, -1, -1) )
     |         println(i)
     | }    
countdown: (n: Int)Unit

scala> countdown(5);   
5
4
3
2
1
0

*/