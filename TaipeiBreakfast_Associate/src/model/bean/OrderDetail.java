package model.bean;

public class OrderDetail {
	public int OrderDetailID;
    public int MealID;
    public int Count;
    public double Price;
    public int OrderSumID;

    public Meal Meal;
    public OrderSum OrderSum;
	
	
	public int getOrderDetailID() {
		return OrderDetailID;
	}
	public void setOrderDetailID(int orderDetailID) {
		OrderDetailID = orderDetailID;
	}
	public int getMealID() {
		return MealID;
	}
	public void setMealID(int mealID) {
		MealID = mealID;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getOrderSumID() {
		return OrderSumID;
	}
	public void setOrderSumID(int orderSumID) {
		OrderSumID = orderSumID;
	}
	public Meal getMeal() {
		return Meal;
	}
	public void setMeal(Meal meal) {
		Meal = meal;
	}
	public OrderSum getOrderSum() {
		return OrderSum;
	}
	public void setOrderSum(OrderSum orderSum) {
		OrderSum = orderSum;
	}
    
}
