package model.bean;

import java.util.HashSet;
import java.util.Set;

public class OrderSum {
	 public OrderSum()
     {
         this.OrderDetail = new HashSet<OrderDetail>();
     }
 
     public int OrderSumID;
     public int ShopID;
     public int MemberID;
     public double TotalPrice;
     public java.sql.Date OrderTime;
     public java.sql.Date ExpectTime;
     public String Memo;
     public int StarsforOwn;
     public String evaluateforShop;
     public int OrderCondID;
 
     public Member Member;
     public OrderCond OrderCond;
     public Set<OrderDetail> OrderDetail;
     public Shop Shop;
	public int getOrderSumID() {
		return OrderSumID;
	}
	public void setOrderSumID(int orderSumID) {
		OrderSumID = orderSumID;
	}
	public int getShopID() {
		return ShopID;
	}
	public void setShopID(int shopID) {
		ShopID = shopID;
	}
	public int getMemberID() {
		return MemberID;
	}
	public void setMemberID(int memberID) {
		MemberID = memberID;
	}
	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	public java.sql.Date getOrderTime() {
		return OrderTime;
	}
	public void setOrderTime(java.sql.Date orderTime) {
		OrderTime = orderTime;
	}
	public java.sql.Date getExpectTime() {
		return ExpectTime;
	}
	public void setExpectTime(java.sql.Date expectTime) {
		ExpectTime = expectTime;
	}
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String memo) {
		Memo = memo;
	}
	public int getStarsforOwn() {
		return StarsforOwn;
	}
	public void setStarsforOwn(int starsforOwn) {
		StarsforOwn = starsforOwn;
	}
	public String getEvaluateforShop() {
		return evaluateforShop;
	}
	public void setEvaluateforShop(String evaluateforShop) {
		this.evaluateforShop = evaluateforShop;
	}
	public int getOrderCondID() {
		return OrderCondID;
	}
	public void setOrderCondID(int orderCondID) {
		OrderCondID = orderCondID;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}
	public OrderCond getOrderCond() {
		return OrderCond;
	}
	public void setOrderCond(OrderCond orderCond) {
		OrderCond = orderCond;
	}
	public Set<OrderDetail> getOrderDetail() {
		return OrderDetail;
	}
	public void setOrderDetail(Set<OrderDetail> orderDetail) {
		OrderDetail = orderDetail;
	}
	public Shop getShop() {
		return Shop;
	}
	public void setShop(Shop shop) {
		Shop = shop;
	}
     
     
}
