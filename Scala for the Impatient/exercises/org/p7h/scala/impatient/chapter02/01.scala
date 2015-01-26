//1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero. Write a function that computes this value.

def signum(number: Int) = {
    if (number > 0) 1
    else if (number < 0) -1
    else 0;
}

println(signum(-50), signum(0), signum(50))


/*

scala> def signum(number: Int) = {
     |     if (number > 0) 1
     |     else if (number < 0) -1
     |     else 0;
     | }
signum: (number: Int)Int

scala> println(signum(-50), signum(0), signum(50))
(-1,0,1)

*/