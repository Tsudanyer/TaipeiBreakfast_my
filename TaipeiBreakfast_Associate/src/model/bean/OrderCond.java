package model.bean;

import java.util.HashSet;
import java.util.Set;

public class OrderCond {
	 public OrderCond()
     {
         this.OrderSum = new HashSet<OrderSum>();
     }
 
     public int OrderCondID;
     public String OrderCond1;
 
     public Set<OrderSum> OrderSum;

	public int getOrderCondID() {
		return OrderCondID;
	}

	public void setOrderCondID(int orderCondID) {
		OrderCondID = orderCondID;
	}

	public String getOrderCond1() {
		return OrderCond1;
	}

	public void setOrderCond1(String orderCond1) {
		OrderCond1 = orderCond1;
	}

	public Set<OrderSum> getOrderSum() {
		return OrderSum;
	}

	public void setOrderSum(Set<OrderSum> orderSum) {
		OrderSum = orderSum;
	}
     
}
