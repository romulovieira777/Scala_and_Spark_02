// Criando uma classe

class Fraction(val n: Int, val d: Int) {
	override def toString = n + "/" + d
	def result = n / d.toDouble
	def + (p: Fraction) = {
		new Fraction((n * p.d + d * p.n), (d * p.d))
	}
}

object Fraction {
	def main(args: Array[String]) = {
		val f = new Fraction(2, 4)
		println(f)
		println(f.result)
		val s = new Fraction(3, 5)
		println(s)
		println(s.result)
		val r = f + s
		println(r)
		println(r.result)
	}
}
