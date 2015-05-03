package model.bean;

import java.util.HashSet;
import java.util.Set;

public class Member {
	public Member() {
		this.Accuse = new HashSet<Accuse>();
		this.Favorite = new HashSet<Favorite>();
		this.MessageBoard = new HashSet<MessageBoard>();
		this.OrderSum = new HashSet<OrderSum>();
		this.ReplyMessage = new HashSet<ReplyMessage>();
	}

	public int MemberID;
	public String MemberAcc;
	public String MemberPwd;
	public String MemberLastName;
	public String MemberFirstName;
	public String MemberPhone;
	public String MemberTel;
	public String MemberEmail;
	public String MemberAddr;
	public byte[] MemberImage;
	public boolean MemberStatus;
	public boolean MemberSuspend;
	public int SpecialPriceID;

	public Set<Accuse> Accuse;
	public Set<Favorite> Favorite;
	public SpecialPrice SpecialPrice;
	public Set<MessageBoard> MessageBoard;
	public Set<OrderSum> OrderSum;
	public Set<ReplyMessage> ReplyMessage;

	public int getMemberID() {
		return MemberID;
	}

	public void setMemberID(int memberID) {
		MemberID = memberID;
	}

	public String getMemberAcc() {
		return MemberAcc;
	}

	public void setMemberAcc(String memberAcc) {
		MemberAcc = memberAcc;
	}

	public String getMemberPwd() {
		return MemberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		MemberPwd = memberPwd;
	}

	public String getMemberLastName() {
		return MemberLastName;
	}

	public void setMemberLastName(String memberLastName) {
		MemberLastName = memberLastName;
	}

	public String getMemberFirstName() {
		return MemberFirstName;
	}

	public void setMemberFirstName(String memberFirstName) {
		MemberFirstName = memberFirstName;
	}

	public String getMemberPhone() {
		return MemberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		MemberPhone = memberPhone;
	}

	public String getMemberTel() {
		return MemberTel;
	}

	public void setMemberTel(String memberTel) {
		MemberTel = memberTel;
	}

	public String getMemberEmail() {
		return MemberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		MemberEmail = memberEmail;
	}

	public String getMemberAddr() {
		return MemberAddr;
	}

	public void setMemberAddr(String memberAddr) {
		MemberAddr = memberAddr;
	}

	public byte[] getMemberImage() {
		return MemberImage;
	}

	public void setMemberImage(byte[] memberImage) {
		MemberImage = memberImage;
	}

	public boolean isMemberStatus() {
		return MemberStatus;
	}

	public void setMemberStatus(boolean memberStatus) {
		MemberStatus = memberStatus;
	}

	public boolean isMemberSuspend() {
		return MemberSuspend;
	}

	public void setMemberSuspend(boolean memberSuspend) {
		MemberSuspend = memberSuspend;
	}

	public int getSpecialPriceID() {
		return SpecialPriceID;
	}

	public void setSpecialPriceID(int specialPriceID) {
		SpecialPriceID = specialPriceID;
	}

	public Set<Accuse> getAccuse() {
		return Accuse;
	}

	public void setAccuse(Set<Accuse> accuse) {
		Accuse = accuse;
	}

	public Set<Favorite> getFavorite() {
		return Favorite;
	}

	public void setFavorite(Set<Favorite> favorite) {
		Favorite = favorite;
	}

	public SpecialPrice getSpecialPrice() {
		return SpecialPrice;
	}

	public void setSpecialPrice(SpecialPrice specialPrice) {
		SpecialPrice = specialPrice;
	}

	public Set<MessageBoard> getMessageBoard() {
		return MessageBoard;
	}

	public void setMessageBoard(Set<MessageBoard> messageBoard) {
		MessageBoard = messageBoard;
	}

	public Set<OrderSum> getOrderSum() {
		return OrderSum;
	}

	public void setOrderSum(Set<OrderSum> orderSum) {
		OrderSum = orderSum;
	}

	public Set<ReplyMessage> getReplyMessage() {
		return ReplyMessage;
	}

	public void setReplyMessage(Set<ReplyMessage> replyMessage) {
		ReplyMessage = replyMessage;
	}

}
