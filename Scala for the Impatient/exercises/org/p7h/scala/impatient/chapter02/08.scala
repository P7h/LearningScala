// 8. Write a function  product(s : String) that computes the product, as described in the preceding exercises.

def product(str: String) = {
    str.foldLeft(1L)((a, b) => a * b)
}

println(product("Hello"))