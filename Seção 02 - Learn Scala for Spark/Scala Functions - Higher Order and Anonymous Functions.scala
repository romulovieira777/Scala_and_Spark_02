// Criando uma função de soma
def sum(a: Int, b: Int): Int ={
	if(a > b) 0 else a + sum(a + 1, b)
}

sum(3, 10)


// Criando uma função
def sumOfSquares(a: Int, b: Int): Int {
	if(a > b) 0 else (a * a) + sumOfSquares(a + 1, b)
}

sumOfSquares(1, 5)


// Criando uma função
def sum(f: (Int, Int) => Int, a: Int, b: Int): Int = {
	1
}


// Criando uma função
def sum(f: Int => Int, a: Int, b: Int): Int = {
	if(a > b) 0 else f(a) + sum(f, a + 1, b)
}


// Criando uma função
def id(i: Int) = i


// Criando uma função
def sqr(i: Int) = math.pow(i, 2).toInt


// Criando uma função
def cube(i: Int) = i * i * i


sum(id, 1, 10)
sum(sqr, 1, 10)

val i = (i: Int) => i
val s = (i: Int) => i * i
val c = (i: Int) => i * i * i

i(10)
s(10)
c(10)

sum(i, 1, 10)
sum(s, 1, 10)
sum((i: Int) => i, 1, 10)
sum((i: Int) => i * i, 1, 10)
sum((i: Int) => i * i * i, 1, 10)
