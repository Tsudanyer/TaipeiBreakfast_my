﻿package model.dao;

import java.sql.Date;
import java.util.List;

import model.bean.OrderSum;
import model.bean.Shop;

public interface OrderSumDAO {
	//透過ShopBean的ShopID查詢所有"總訂單"，接續查詢個別總訂單的訂單明細
	public List<OrderSum> queryOrderSum(Shop bean);
	
	//新增一筆訂單需要取得店鋪ID、會員ID、總價格、訂單取餐時間
	public abstract boolean insertOrderSum(Integer shopID, Integer memberID, Double totalPrice,Date expectTime, String memo);
	
	//進行評價需要取得總訂單ID、會員給予星數、會員給予評價
	public abstract boolean updateOrderSum(Integer orderSumID,  Integer starsForOwn, String evaluateForShop);
	
	//更改訂單狀態
	public abstract boolean changeOrderCond(Integer orderSumID);
	
	//刪除一筆訂單需要總訂單ID
	public abstract boolean deleteOrderSum(Integer orderSumID);
	
}