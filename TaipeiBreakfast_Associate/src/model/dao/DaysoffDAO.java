package model.dao;

import model.bean.Daysoff;
import model.bean.Shop;

public interface DaysoffDAO {
	public boolean insertDaysoff(Daysoff bean);
	public boolean updateDaysoff(Daysoff bean);
	public boolean deleteDaysoff(Daysoff bean);
	public boolean queryDaysoff(Shop bean);
}
