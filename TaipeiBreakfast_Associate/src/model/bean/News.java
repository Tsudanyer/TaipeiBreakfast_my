package model.bean;

public class News {
	 public int NewsID;
     public String Title;
     public String Content;
     public java.sql.Date Date;
     public byte[] Image;
	public int getNewsID() {
		return NewsID;
	}
	public void setNewsID(int newsID) {
		NewsID = newsID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public java.sql.Date getDate() {
		return Date;
	}
	public void setDate(java.sql.Date date) {
		Date = date;
	}
	public byte[] getImage() {
		return Image;
	}
	public void setImage(byte[] image) {
		Image = image;
	}
     
     
}
