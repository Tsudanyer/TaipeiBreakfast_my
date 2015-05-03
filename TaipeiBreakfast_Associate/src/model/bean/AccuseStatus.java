package model.bean;

import java.util.HashSet;
import java.util.Set;

public class AccuseStatus {
	public AccuseStatus()
    {
        this.Accuse = new HashSet<Accuse>();
    }

    public int AccuseStatusID ;
    public String AccuseStatus1 ;
    public  Set<Accuse> Accuse ;
    
    public int getAccuseStatusID() {
		return AccuseStatusID;
	}

	public void setAccuseStatusID(int accuseStatusID) {
		AccuseStatusID = accuseStatusID;
	}

	public String getAccuseStatus1() {
		return AccuseStatus1;
	}

	public void setAccuseStatus1(String accuseStatus1) {
		AccuseStatus1 = accuseStatus1;
	}

	public Set<Accuse> getAccuse() {
		return Accuse;
	}

	public void setAccuse(Set<Accuse> accuse) {
		Accuse = accuse;
	}

	
}
