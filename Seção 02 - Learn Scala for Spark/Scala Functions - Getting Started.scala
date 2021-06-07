// Criando uma função fatorial
def fact(i: Int): Int = {
	var res = 1
	for(e <- i to 1 by -1)
		res *= e
	res
}

val a = 5
fact(5)


// Criando uma função fatorial
def factr(i: Int): Int = if(i == 1) 1 else i * factr(i - 1)

factr(5)


// Criando uma função fibonacci
def fibo(i: Int) = {
	var pre = 0
	var curr = 1
	print(pre + "\t" + curr)
	var res = 0
	for(e <- 3 to i) {
		res = pre + curr
		pre = curr
		curr = res
		print("\t" + res)
	}
}

fibo(10)


// Criando uma função
def nCr(n: Int, r: Int) = {
	def fact(i: Int) = {
		var res = 1
	for(e <- i to 1 by -1)
		res = res * e
	res
	}
	fact(n) / (fact(n - r) * fact(r))
}

nCr(6, 3)
