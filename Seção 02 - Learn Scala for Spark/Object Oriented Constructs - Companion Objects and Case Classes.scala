// Criando uma classe

class A(private val message: String)

object A {
	val a = new A("Hello World!")
	println(a.message)
}


// Criando uma classe

class B(val message: String)

object B {
	val a = new B("Hello World")
	println(a.message)
}


// Criando uma classe
class OrderItem
(
	var orderItemId: Int, 
	var orderItemOrderId: Int, 
	var orderItemProductId: Int, 
	var orderItemQuantity: Int, 
	var orderItemSubtotal: Float, 
	var orderItemProductPrice: Float
)


case class OrderItem
(
	var orderItemId: Int, 
	var orderItemOrderId: Int, 
	var orderItemProductId: Int, 
	var orderItemQuantity: Int, 
	var orderItemSubtotal: Float, 
	var orderItemProductPrice: Float
)


class A(val i: Int)
object A {
	def apply(i: Int) = {
		new A(i)
	}
}

val a = A.apply(10)
val a = A(10)
val a = A(20)


// Criando uma classe
class A(val i: Int) {
	def apply = {
		println("Inside class apply")
		new = A(30)
	}
}

object A {
	def apply(i: Int) = {
		new A(i)
	}
}

val oi = OrderItem(1, 1, 1, 3, 150.0f, 50.0f)
