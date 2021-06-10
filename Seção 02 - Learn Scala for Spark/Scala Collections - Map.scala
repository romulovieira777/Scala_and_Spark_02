1 -> "Hello"
val m = Map((1. "Hello"), 2 -> "World")
m(1)
m(2)
m.get(1)
m.get(1).get
m.getOrElse(1, "Not available")


// Criando uma classe
case class Order(
	orderId: Int,
	orderDate: String,
	orderCustomerId: Int,
	orderStatus: String
)


// Criando uma variável
val m Map(
	(1, Order("2017-01-01", 100, "COMPLETE")),
	(2, Order("2017-01-01", 20, "CLOSED"))
)
