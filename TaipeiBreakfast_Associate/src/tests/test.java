package tests;

import java.util.Iterator;
import java.util.List;

import model.bean.Meal;
import model.bean.OrderDetail;
import model.bean.OrderSum;
import model.bean.Shop;
import model.dao.imp.OrderSumDAOHibernate;

import org.hibernate.SessionFactory;

import Utility.HibernateFactory;

public class test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateFactory.getSessionFactory();
		OrderSumDAOHibernate dao = new OrderSumDAOHibernate();
		dao.setSessionFactory(sessionFactory);
		Shop bean = new Shop();
		bean.setShopID(3);
		List<OrderSum> orderSums = dao.queryOrderSum(bean);
		Iterator list = orderSums.iterator();
		while(list.hasNext()){
			OrderSum orderSum = (OrderSum) list.next();
			System.out.println("orderSumDetail.TotalPrice="+orderSum.getTotalPrice());
			Iterator orderDetails = orderSum.getOrderDetail().iterator();
			while(orderDetails.hasNext()){
				OrderDetail orderDetail = (OrderDetail) orderDetails.next();
				System.out.println("orderDetail.getPrice="+orderDetail.getPrice());
				Meal meal = orderDetail.getMeal();
				System.out.println("meal.getMealName="+meal.getMealName());
			}
		}
		sessionFactory.close();
	}

}
