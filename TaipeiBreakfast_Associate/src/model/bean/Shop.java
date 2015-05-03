package model.bean;

import java.util.HashSet;
import java.util.Set;

public class Shop {
	public Shop()
    {
        this.Daysoff = new HashSet<Daysoff>();
        this.Meal = new HashSet<Meal>();
        this.OrderSum = new HashSet<OrderSum>();
    }

    public int ShopID;
    public String ShopName;
    public String ShopPhone;
    public String ShopCity;
    public String ShopArea;
    public String ShopAddr;
    public java.sql.Date LastOrderNoon;
    public java.sql.Date LastOrderNight;
    public int OwnID;
    public byte[] LogoImage;
    public boolean ShopSuspend;
    public int ShopCondID;
    public java.sql.Date BeginBusinessTime;
    public java.sql.Date EndBusinessTime;
    public String BusinessTimeNote;

    public Set<Daysoff> Daysoff;
    public Set<Meal> Meal;
    public Set<OrderSum> OrderSum;
	public int getShopID() {
		return ShopID;
	}
	public void setShopID(int shopID) {
		ShopID = shopID;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getShopPhone() {
		return ShopPhone;
	}
	public void setShopPhone(String shopPhone) {
		ShopPhone = shopPhone;
	}
	public String getShopCity() {
		return ShopCity;
	}
	public void setShopCity(String shopCity) {
		ShopCity = shopCity;
	}
	public String getShopArea() {
		return ShopArea;
	}
	public void setShopArea(String shopArea) {
		ShopArea = shopArea;
	}
	public String getShopAddr() {
		return ShopAddr;
	}
	public void setShopAddr(String shopAddr) {
		ShopAddr = shopAddr;
	}
	public java.sql.Date getLastOrderNoon() {
		return LastOrderNoon;
	}
	public void setLastOrderNoon(java.sql.Date lastOrderNoon) {
		LastOrderNoon = lastOrderNoon;
	}
	public java.sql.Date getLastOrderNight() {
		return LastOrderNight;
	}
	public void setLastOrderNight(java.sql.Date lastOrderNight) {
		LastOrderNight = lastOrderNight;
	}
	public int getOwnID() {
		return OwnID;
	}
	public void setOwnID(int ownID) {
		OwnID = ownID;
	}
	public byte[] getLogoImage() {
		return LogoImage;
	}
	public void setLogoImage(byte[] logoImage) {
		LogoImage = logoImage;
	}
	public boolean isShopSuspend() {
		return ShopSuspend;
	}
	public void setShopSuspend(boolean shopSuspend) {
		ShopSuspend = shopSuspend;
	}
	public int getShopCondID() {
		return ShopCondID;
	}
	public void setShopCondID(int shopCondID) {
		ShopCondID = shopCondID;
	}
	public java.sql.Date getBeginBusinessTime() {
		return BeginBusinessTime;
	}
	public void setBeginBusinessTime(java.sql.Date beginBusinessTime) {
		BeginBusinessTime = beginBusinessTime;
	}
	public java.sql.Date getEndBusinessTime() {
		return EndBusinessTime;
	}
	public void setEndBusinessTime(java.sql.Date endBusinessTime) {
		EndBusinessTime = endBusinessTime;
	}
	public String getBusinessTimeNote() {
		return BusinessTimeNote;
	}
	public void setBusinessTimeNote(String businessTimeNote) {
		BusinessTimeNote = businessTimeNote;
	}
	public Set<Daysoff> getDaysoff() {
		return Daysoff;
	}
	public void setDaysoff(Set<Daysoff> daysoff) {
		Daysoff = daysoff;
	}
	public Set<Meal> getMeal() {
		return Meal;
	}
	public void setMeal(Set<Meal> meal) {
		Meal = meal;
	}
	public Set<OrderSum> getOrderSum() {
		return OrderSum;
	}
	public void setOrderSum(Set<OrderSum> orderSum) {
		OrderSum = orderSum;
	}
    
}
