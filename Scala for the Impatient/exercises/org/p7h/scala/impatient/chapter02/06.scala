// 6. Write a  for loop for computing the product of the Unicode codes of all letters in a string. For example, the product of the characters in  "Hello" is  9415087488L .

var prod = 1
var prodL = 1L
for (c <- "Hello") {
    prod *= c
    prodL *= c
    println(c, prod, prodL)
}