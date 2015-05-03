package model.bean;

public class Advertisement {
	 public int AdvertisementID ;
     public String Context ;
     public byte[] Image ;
     public int Days ;
     public int AdvertisementStatusID ;
     public int ShopID ;
     public AdvertisementStatus AdvertisementStatus ;
	public int getAdvertisementID() {
		return AdvertisementID;
	}
	public void setAdvertisementID(int advertisementID) {
		AdvertisementID = advertisementID;
	}
	public String getContext() {
		return Context;
	}
	public void setContext(String context) {
		Context = context;
	}
	public byte[] getImage() {
		return Image;
	}
	public void setImage(byte[] image) {
		Image = image;
	}
	public int getDays() {
		return Days;
	}
	public void setDays(int days) {
		Days = days;
	}
	public int getAdvertisementStatusID() {
		return AdvertisementStatusID;
	}
	public void setAdvertisementStatusID(int advertisementStatusID) {
		AdvertisementStatusID = advertisementStatusID;
	}
	public int getShopID() {
		return ShopID;
	}
	public void setShopID(int shopID) {
		ShopID = shopID;
	}
	public AdvertisementStatus getAdvertisementStatus() {
		return AdvertisementStatus;
	}
	public void setAdvertisementStatus(AdvertisementStatus advertisementStatus) {
		AdvertisementStatus = advertisementStatus;
	}
     
}
