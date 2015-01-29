// 9. Make the function of the preceding exercise a recursive function.

def productRecursive(s: String):Long = {
    if(s.length == 0) 1
    else s(0) * productRecursive(s drop 1)
}
productRecursive("Hello")       