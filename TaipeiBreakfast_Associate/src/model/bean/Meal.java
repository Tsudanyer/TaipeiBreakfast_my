package model.bean;

import java.util.HashSet;
import java.util.Set;

public class Meal {
	 public Meal()
     {
         this.Favorite = new HashSet<Favorite>();
         this.OrderDetail = new HashSet<OrderDetail>();
         this.SpecialPrice = new HashSet<SpecialPrice>();
     }
 
     public int MealID;
     public String MealName;
     public double Price;
     public int ShopID;
     public byte[] MealImage;
     public boolean MealStatus;
     public int MealKindID;
 
     public Set<Favorite> Favorite;
     public MealKindList MealKindList;
     public Shop Shop;
     public Set<OrderDetail> OrderDetail;
     public Set<SpecialPrice> SpecialPrice;
	public int getMealID() {
		return MealID;
	}
	public void setMealID(int mealID) {
		MealID = mealID;
	}
	public String getMealName() {
		return MealName;
	}
	public void setMealName(String mealName) {
		MealName = mealName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getShopID() {
		return ShopID;
	}
	public void setShopID(int shopID) {
		ShopID = shopID;
	}
	public byte[] getMealImage() {
		return MealImage;
	}
	public void setMealImage(byte[] mealImage) {
		MealImage = mealImage;
	}
	public boolean isMealStatus() {
		return MealStatus;
	}
	public void setMealStatus(boolean mealStatus) {
		MealStatus = mealStatus;
	}
	public int getMealKindID() {
		return MealKindID;
	}
	public void setMealKindID(int mealKindID) {
		MealKindID = mealKindID;
	}
	public Set<Favorite> getFavorite() {
		return Favorite;
	}
	public void setFavorite(Set<Favorite> favorite) {
		Favorite = favorite;
	}
	public MealKindList getMealKindList() {
		return MealKindList;
	}
	public void setMealKindList(MealKindList mealKindList) {
		MealKindList = mealKindList;
	}
	public Shop getShop() {
		return Shop;
	}
	public void setShop(Shop shop) {
		Shop = shop;
	}
	public Set<OrderDetail> getOrderDetail() {
		return OrderDetail;
	}
	public void setOrderDetail(Set<OrderDetail> orderDetail) {
		OrderDetail = orderDetail;
	}
	public Set<SpecialPrice> getSpecialPrice() {
		return SpecialPrice;
	}
	public void setSpecialPrice(Set<SpecialPrice> specialPrice) {
		SpecialPrice = specialPrice;
	}
     
     
}
