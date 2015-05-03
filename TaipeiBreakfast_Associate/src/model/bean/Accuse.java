package model.bean;

public class Accuse {
	public int AccuseID ;
    public int MemberID ;
    public String AccuseSub ;
    public String AccuseContent ;
    public int AccuseStatusID ;
    public java.sql.Date AccuseTime ;
    public AccuseStatus AccuseStatus ;
    public Member Member ;
    
	public int getAccuseID() {
		return AccuseID;
	}
	public void setAccuseID(int accuseID) {
		AccuseID = accuseID;
	}
	public int getMemberID() {
		return MemberID;
	}
	public void setMemberID(int memberID) {
		MemberID = memberID;
	}
	public String getAccuseSub() {
		return AccuseSub;
	}
	public void setAccuseSub(String accuseSub) {
		AccuseSub = accuseSub;
	}
	public String getAccuseContent() {
		return AccuseContent;
	}
	public void setAccuseContent(String accuseContent) {
		AccuseContent = accuseContent;
	}
	public int getAccuseStatusID() {
		return AccuseStatusID;
	}
	public void setAccuseStatusID(int accuseStatusID) {
		AccuseStatusID = accuseStatusID;
	}
	public java.sql.Date getAccuseTime() {
		return AccuseTime;
	}
	public void setAccuseTime(java.sql.Date accuseTime) {
		AccuseTime = accuseTime;
	}
	public AccuseStatus getAccuseStatus() {
		return AccuseStatus;
	}
	public void setAccuseStatus(AccuseStatus accuseStatus) {
		AccuseStatus = accuseStatus;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}
}
