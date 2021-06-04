// Expression

val c = {
	val i = (math.random * 100).toInt
	val j = (math.random * 100).toInt
	i - j
	println(i)
	println(j)
}

println(c)


// Nested block
val a = {
	val x = 0
	val y = 1
	val b = {
		val y = 2
		println("Value of x inside nested block is " + x)
		println("Value of y inside nested block is " + y)
	}
	println("Value of x inside main block is " + x)
	println("Value of y inside main block is " + y)
}
