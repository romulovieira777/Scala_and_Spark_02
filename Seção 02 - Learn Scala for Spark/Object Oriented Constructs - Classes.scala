// Created by Romulo 07/06/21

class Departments {
	(Int departmentId, String departmentName);

class Departments(departmentId: Int, departmentName: String)
}


class Department(val departmentId: Int, val departmentName: String)

val d = new Department(1, "Fan Shop")

d.departmentId
d.departmentName


// Criando uma classe
class Department(var departmentId: Int, var departmentName: String) {
	println("Department_Id is " + departmentId + " and department_Name is " + departmentName)
}

val d = new Department(1, "Fan Shop")


// Criando uma classe
class Department(var departmentId: Int, var departmentName: String) {
	println("Department_Id is " + departmentId + " and department_Name is " + departmentName)
	override def toString = "Department(" +departmentId + "," + departmentName + ")" 
}

val d = new Department(1, "Fan Shop")


// Criando uma classe
class OrderItem(orderItemId: Int, orderItemOrderId: Int, orderItemProductId: Int, orderItemQuantity: Int, 
	orderItemSubtotal: Float, orderItemProductPrice: Float)


// Criando uma classe
class OrderItem
(
	var orderItemId: Int, 
	var orderItemOrderId: Int, 
	var orderItemProductId: Int, 
	var orderItemQuantity: Int, 
	var orderItemSubtotal: Float, 
	var orderItemProductPrice: Float
) {
	require(orderItemSubtotal == orderItemQuantity * orderItemProductPrice, "Invalid orderItemSubtotal")
	this(
		orderItemId: Int,
		orderItemOrderId: Int,
		orderItemProductId: Int,
		orderItemQuantity: Int,
		orderItemSubtotal: Float,
		orderItemProductPrice: Float
	) = {
		this(
			orderItemId, 
			orderItemOrderId, 
			orderItemProductId, 
			orderItemQuantity, 
			orderItemQuantity * orderItemProductPrice, 
			orderItemProductPrice)
	}
	override def toString = "OrderItem(" + 
	orderItemId + "," + 
	orderItemOrderId + "," + 
	orderItemProductId + "," + 
	orderItemQuantity + "," + 
	orderItemSubtotal + "," + 
	orderItemProductPrice ")"
}

val oi = new OrderItem(1, 1, 1, 3, 100, 50)
