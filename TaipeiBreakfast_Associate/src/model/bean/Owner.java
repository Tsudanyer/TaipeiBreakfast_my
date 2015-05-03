package model.bean;

public class Owner {
	 public int OwnID;
     public String OwnAcc;
     public String OwnPwd;
     public String OwnEmail;
     public String OwnLastName;
     public String OwnFirstName;
     public boolean OwnStatus;
     public boolean OwnSuspend;
	public int getOwnID() {
		return OwnID;
	}
	public void setOwnID(int ownID) {
		OwnID = ownID;
	}
	public String getOwnAcc() {
		return OwnAcc;
	}
	public void setOwnAcc(String ownAcc) {
		OwnAcc = ownAcc;
	}
	public String getOwnPwd() {
		return OwnPwd;
	}
	public void setOwnPwd(String ownPwd) {
		OwnPwd = ownPwd;
	}
	public String getOwnEmail() {
		return OwnEmail;
	}
	public void setOwnEmail(String ownEmail) {
		OwnEmail = ownEmail;
	}
	public String getOwnLastName() {
		return OwnLastName;
	}
	public void setOwnLastName(String ownLastName) {
		OwnLastName = ownLastName;
	}
	public String getOwnFirstName() {
		return OwnFirstName;
	}
	public void setOwnFirstName(String ownFirstName) {
		OwnFirstName = ownFirstName;
	}
	public boolean isOwnStatus() {
		return OwnStatus;
	}
	public void setOwnStatus(boolean ownStatus) {
		OwnStatus = ownStatus;
	}
	public boolean isOwnSuspend() {
		return OwnSuspend;
	}
	public void setOwnSuspend(boolean ownSuspend) {
		OwnSuspend = ownSuspend;
	}
     
}
