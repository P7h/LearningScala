/* 

10. Write a function that computes x<sup>n</sup>, where n is an integer. Use the following recursive definition:
    - x<sup>n</sup> = y<sup>2</sup> if n is even and positive, where y = x <sup>n / 2</sup>.
    - x<sup>n</sup> = x * x<sup>n – 1</sup> if n is odd and positive.
    - x<sup>0</sup> = 1.
    - x<sup>n</sup> = 1 / x<sup>–n</sup> if n is negative.

Don’t use a  return statement.

*/

def powerOfXToN(x: BigInt, n: Int) : BigInt = {
    if(n > 0 && n % 2 == 0) powerOfXToN(x, n / 2) * powerOfXToN(x, n / 2)
    else if(n > 0) x * powerOfXToN(x, n - 1)
    else if(n == 0) 1
    else 1 / powerOfXToN(x, -n)
}

powerOfXToN(2, 100)