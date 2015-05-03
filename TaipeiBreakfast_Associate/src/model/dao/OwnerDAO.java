package model.dao;

import java.util.List;

import model.bean.Owner;
import model.bean.Shop;

public interface OwnerDAO {   //更多細節請看其實作類別(model.dao.imp.OwnerHibernateDAO)
	
    //用賣方帳號得到"該筆"賣方所有資料, 之後可business service可用此方法
	public abstract Owner select(String ownerAccount);
    
	//查"所有"賣方資料
	public abstract List<Owner> selectAll();
	
    //利用賣方ID查該賣方所擁有全部店鋪資料
	public abstract List<Shop> getShops(Integer ownID);

	//新增一筆賣方資料
	public abstract Owner insert(Owner ownerBean);

	//更改賣方資料
	public abstract Owner update(Owner ownerBean);
	
    //賣方刪帳號時所用的方法,但實作是update改賣方的ownStatus而已
	public abstract boolean delete(Integer ownID);

}