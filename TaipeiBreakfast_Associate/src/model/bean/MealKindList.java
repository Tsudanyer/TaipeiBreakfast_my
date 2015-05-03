package model.bean;

import java.util.HashSet;
import java.util.Set;

public class MealKindList {
	 public MealKindList()
     {
         this.Meal = new HashSet<Meal>();
     }
 
     public int MealKindID;
     public String MealKindName;
     public byte[] DefaultImage;
 
     public Set<Meal> Meal;

	public int getMealKindID() {
		return MealKindID;
	}

	public void setMealKindID(int mealKindID) {
		MealKindID = mealKindID;
	}

	public String getMealKindName() {
		return MealKindName;
	}

	public void setMealKindName(String mealKindName) {
		MealKindName = mealKindName;
	}

	public byte[] getDefaultImage() {
		return DefaultImage;
	}

	public void setDefaultImage(byte[] defaultImage) {
		DefaultImage = defaultImage;
	}

	public Set<Meal> getMeal() {
		return Meal;
	}

	public void setMeal(Set<Meal> meal) {
		Meal = meal;
	}
     
}
