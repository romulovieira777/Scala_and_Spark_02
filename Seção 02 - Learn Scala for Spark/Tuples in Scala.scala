(1 -> "Hello")
val t = (1 -> "Hello")
t._1
t._2

val t = (1 -> "Hello", "World")
val t = (1, List(1, 2, 3, 4))
val t = List((1, "Hello"), (2, "World"))


// Criando uma classe
case classe(
	orderId: Int, 
	orderDate: String, 
	OrderCustomerId: Int, 
	orderStatus: String
)


// Declarando uma variável
val t = List((1, Set(
	Order(1, "2017-01-01", 100, "COMPLETE"),
	Order(2, "2017-01-01", 20, "CLOSED"),
	Order(3, "2017-01-01", 301, "PENDING"),
	Order(4, "2017-01-01", 202, "CLOSED"),
	Order(5, "2017-01-01", 3013, "COMPLETE"),
	Order(6, "2017-01-01", 203, "PENDING"),
	Order(7, "2017-01-01", 3014, "COMPLETE"),
	Order(8, "2017-01-01", 20, "NEW"),
	Order(9, "2017-01-01", 301, "PENDING"),
	Order(10, "2017-01-01", 2, "CLOSED"),
	Order(11, "2017-01-01", 1, "COMPLETE"),
	Order(12, "2017-01-01", 3, "NEW"),
	Order(13, "2017-01-01", 301, "COMPLETE")
)),
(2, Set(
	Order(1, "2017-01-01", 100, "COMPLETE"),
	Order(2, "2017-01-01", 20, "CLOSED"),
	Order(3, "2017-01-01", 301, "PENDING"),
	Order(4, "2017-01-01", 202, "CLOSED"),
	Order(5, "2017-01-01", 3013, "COMPLETE"),
	Order(6, "2017-01-01", 203, "PENDING"),
	Order(7, "2017-01-01", 3014, "COMPLETE"),
	Order(8, "2017-01-01", 20, "NEW"),
	Order(9, "2017-01-01", 301, "PENDING"),
	Order(10, "2017-01-01", 2, "CLOSED"),
	Order(11, "2017-01-01", 1, "COMPLETE"),
	Order(12, "2017-01-01", 3, "NEW"),
	Order(13, "2017-01-01", 301, "COMPLETE")
)))
