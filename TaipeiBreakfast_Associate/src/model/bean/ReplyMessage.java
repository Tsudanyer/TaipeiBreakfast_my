package model.bean;

public class ReplyMessage {
	public int ReplyMessageID;
    public int MessageID;
    public int MemberID;
    public String ReplyMessage1;
    public java.sql.Date ReplyDate;
    public String IpAddress;

    public Member Member;
    public MessageBoard MessageBoard;
	public int getReplyMessageID() {
		return ReplyMessageID;
	}
	public void setReplyMessageID(int replyMessageID) {
		ReplyMessageID = replyMessageID;
	}
	public int getMessageID() {
		return MessageID;
	}
	public void setMessageID(int messageID) {
		MessageID = messageID;
	}
	public int getMemberID() {
		return MemberID;
	}
	public void setMemberID(int memberID) {
		MemberID = memberID;
	}
	public String getReplyMessage1() {
		return ReplyMessage1;
	}
	public void setReplyMessage1(String replyMessage1) {
		ReplyMessage1 = replyMessage1;
	}
	public java.sql.Date getReplyDate() {
		return ReplyDate;
	}
	public void setReplyDate(java.sql.Date replyDate) {
		ReplyDate = replyDate;
	}
	public String getIpAddress() {
		return IpAddress;
	}
	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}
	public MessageBoard getMessageBoard() {
		return MessageBoard;
	}
	public void setMessageBoard(MessageBoard messageBoard) {
		MessageBoard = messageBoard;
	}
    
}
