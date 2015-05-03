package model.bean;

import java.util.HashSet;
import java.util.Set;

public class AdministratorPermission {
	 public AdministratorPermission()
     {
         this.Administrator = new HashSet<Administrator>();
     }
 
     public int AdministratorPermissionID ;
     public String AdministratorPermissionStatus ;
     public Set<Administrator> Administrator ;
 
     public int getAdministratorPermissionID() {
		return AdministratorPermissionID;
	}

	public void setAdministratorPermissionID(int administratorPermissionID) {
		AdministratorPermissionID = administratorPermissionID;
	}

	public String getAdministratorPermissionStatus() {
		return AdministratorPermissionStatus;
	}

	public void setAdministratorPermissionStatus(
			String administratorPermissionStatus) {
		AdministratorPermissionStatus = administratorPermissionStatus;
	}

	public Set<Administrator> getAdministrator() {
		return Administrator;
	}

	public void setAdministrator(Set<Administrator> administrator) {
		Administrator = administrator;
	}

	
}
