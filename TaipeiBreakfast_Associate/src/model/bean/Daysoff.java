package model.bean;

public class Daysoff {
	public int DaysoffID;
    public int ShopID;
    public java.sql.Date Daysoff1;
    public Shop Shop;
    
	public int getDaysoffID() {
		return DaysoffID;
	}
	public void setDaysoffID(int daysoffID) {
		DaysoffID = daysoffID;
	}
	public int getShopID() {
		return ShopID;
	}
	public void setShopID(int shopID) {
		ShopID = shopID;
	}
	public java.sql.Date getDaysoff1() {
		return Daysoff1;
	}
	public void setDaysoff1(java.sql.Date daysoff1) {
		Daysoff1 = daysoff1;
	}
	public Shop getShop() {
		return Shop;
	}
	public void setShop(Shop shop) {
		Shop = shop;
	}
    
}
