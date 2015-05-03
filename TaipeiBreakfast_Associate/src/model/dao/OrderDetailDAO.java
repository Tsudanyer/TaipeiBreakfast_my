package model.dao;

import java.util.List;

import model.bean.OrderDetail;
import model.bean.OrderSum;

public interface OrderDetailDAO {
	//利用個別總訂單查詢訂單明細，接著查詢餐點名字
	public List<OrderDetail> queryOrderDetails(OrderSum bean);
}
