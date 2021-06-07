// Created by Romulo 07/06/21

/*
object comb {
	// public static void main(String[] args)
	def main(args: Array[String]) {
		println("Hello World!!")
	}
}
*/


object combination {
	def nCr(n: Int, r: Int) = {
		def fact(i: Int) = {
			var res = 1
			for(e <- i to 1 by -1)
				res = res * e
			res
		}
		fact(n) / (fact(n - r) * fact(r))
	}
	def main(args: Array[String]) {
		val n = args(0).toInt
		val r = args(1).toInt
		val c = nCr(n, r)
		println("There are " + c + " combinations of " + r " in " + n + " elements")
	}
}
