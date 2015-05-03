package model.bean;

public class Administrator {
	 public int AdministratorID ;
     public String AdministrtorAcc ;
     public String AdministrtorPwd ;
     
    public int getAdministratorID() {
		return AdministratorID;
	}
	public void setAdministratorID(int administratorID) {
		AdministratorID = administratorID;
	}
	public String getAdministrtorAcc() {
		return AdministrtorAcc;
	}
	public void setAdministrtorAcc(String administrtorAcc) {
		AdministrtorAcc = administrtorAcc;
	}
	public String getAdministrtorPwd() {
		return AdministrtorPwd;
	}
	public void setAdministrtorPwd(String administrtorPwd) {
		AdministrtorPwd = administrtorPwd;
	}
	public int getAdministrtorPermissionID() {
		return AdministrtorPermissionID;
	}
	public void setAdministrtorPermissionID(int administrtorPermissionID) {
		AdministrtorPermissionID = administrtorPermissionID;
	}
	public AdministratorPermission getAdministratorPermission() {
		return AdministratorPermission;
	}
	public void setAdministratorPermission(
			AdministratorPermission administratorPermission) {
		AdministratorPermission = administratorPermission;
	}
	public int AdministrtorPermissionID ;
     public AdministratorPermission AdministratorPermission ;
}
