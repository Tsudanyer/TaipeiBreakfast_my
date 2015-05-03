package model.bean;

import java.util.HashSet;
import java.util.Set;

import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage;

public class MessageBoard {
	public MessageBoard()
    {
        this.ReplyMessage = new HashSet<ReplyMessage>();
    }

    public int MessageID;
    public int MemberID;
    public String Context;
    public java.sql.Date MessageDate;
    public String IPAddress;

    public Member Member;
    public Set<ReplyMessage> ReplyMessage;
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
	public String getContext() {
		return Context;
	}
	public void setContext(String context) {
		Context = context;
	}
	public java.sql.Date getMessageDate() {
		return MessageDate;
	}
	public void setMessageDate(java.sql.Date messageDate) {
		MessageDate = messageDate;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}
	public Set<ReplyMessage> getReplyMessage() {
		return ReplyMessage;
	}
	public void setReplyMessage(Set<ReplyMessage> replyMessage) {
		ReplyMessage = replyMessage;
	}
    
}
