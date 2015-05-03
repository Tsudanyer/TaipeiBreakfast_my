package model.bean;

public class Favorite {
	public int FavoriteID;
    public int MemberID;
    public int MealID;
    public Meal Meal;
    public Member Member;
    
	public int getFavoriteID() {
		return FavoriteID;
	}
	public void setFavoriteID(int favoriteID) {
		FavoriteID = favoriteID;
	}
	public int getMemberID() {
		return MemberID;
	}
	public void setMemberID(int memberID) {
		MemberID = memberID;
	}
	public int getMealID() {
		return MealID;
	}
	public void setMealID(int mealID) {
		MealID = mealID;
	}
	public Meal getMeal() {
		return Meal;
	}
	public void setMeal(Meal meal) {
		Meal = meal;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}
    
}
