val c = {
	val i = 1
	val j = math.pow(2, 10)
	i - j
}

val i = math.random

val i = math.random * 100

val i = (math.random* 100).abs

val i = (math.random * 100).toInt

val j = (math.random * 100).toInt

if(i > j) {
	println(i)
} else if(i == j) {
	println("Equal")
} else 
	println(j)

if(i > j) i else j


var ctr = 96
while(ctr >= j) {
	println(ctr)
	ctr -= 1
}


for(e <- j to i by 2)
	println(e)


// Fibonacci em Scala
val a = 10
var pre = 0
var curr = 1
println(pre)
println(curr)
var res = 0
for(e <- 2 to a - 1) {
	res = pre + curr
	println(res)
	pre = curr
	curr = res
}
