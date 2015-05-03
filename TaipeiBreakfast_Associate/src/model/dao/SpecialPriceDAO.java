package model.dao;

import java.util.List;

import model.bean.Shop;
import model.bean.SpecialPrice;

public interface SpecialPriceDAO {
	//SpecialBean 去做新增、刪除、修改
	public boolean insertSpecialPrice(SpecialPrice bean);
	public boolean updateSpecialPrice(SpecialPrice bean);
	public boolean deleteSpecialPrice(SpecialPrice bean);
	//透過ShopBean 查詢該店家優惠券(ShopBean最少有ShopID)
	public List<SpecialPrice> querySpecialPrice(Shop bean);
}
