package model.bean;

import java.util.HashSet;
import java.util.Set;

public class SpecialPrice {
	 public SpecialPrice()
     {
         this.Member = new HashSet<Member>();
     }
 
     public int SpecialPriceID;
     public int MealID;
     public int SpecialPrice1;
     public java.sql.Date StartDate;
     public java.sql.Date EndDate;
 
     public Meal Meal;
     public Set<Member> Member;
	public int getSpecialPriceID() {
		return SpecialPriceID;
	}
	public void setSpecialPriceID(int specialPriceID) {
		SpecialPriceID = specialPriceID;
	}
	public int getMealID() {
		return MealID;
	}
	public void setMealID(int mealID) {
		MealID = mealID;
	}
	public int getSpecialPrice1() {
		return SpecialPrice1;
	}
	public void setSpecialPrice1(int specialPrice1) {
		SpecialPrice1 = specialPrice1;
	}
	public java.sql.Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(java.sql.Date startDate) {
		StartDate = startDate;
	}
	public java.sql.Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(java.sql.Date endDate) {
		EndDate = endDate;
	}
	public Meal getMeal() {
		return Meal;
	}
	public void setMeal(Meal meal) {
		Meal = meal;
	}
	public Set<Member> getMember() {
		return Member;
	}
	public void setMember(Set<Member> member) {
		Member = member;
	}
     
}
