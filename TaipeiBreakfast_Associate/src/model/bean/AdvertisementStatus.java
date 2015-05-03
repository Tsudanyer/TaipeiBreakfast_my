package model.bean;

import java.util.HashSet;
import java.util.Set;

public class AdvertisementStatus {
	public AdvertisementStatus() {
		this.Advertisement = new HashSet<Advertisement>();
	}

	public int AdvertisementStatusID;
	public String AdvertisementStatus1;
	public Set<Advertisement> Advertisement;

	public int getAdvertisementStatusID() {
		return AdvertisementStatusID;
	}

	public void setAdvertisementStatusID(int advertisementStatusID) {
		AdvertisementStatusID = advertisementStatusID;
	}

	public String getAdvertisementStatus1() {
		return AdvertisementStatus1;
	}

	public void setAdvertisementStatus1(String advertisementStatus1) {
		AdvertisementStatus1 = advertisementStatus1;
	}

	public Set<Advertisement> getAdvertisement() {
		return Advertisement;
	}

	public void setAdvertisement(Set<Advertisement> advertisement) {
		Advertisement = advertisement;
	}

}
