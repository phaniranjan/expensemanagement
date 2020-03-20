package com.testvagrant.expensemanagement.data;

import java.util.Calendar;
import java.util.HashMap;

public final class NewsPaperData {

	final double newsPaperCost[][] = { { 3.0, 3.0, 3.0, 3.0, 3.0, 5.0, 6.0 }, { 2.5, 2.5, 2.5, 2.5, 2.5, 4.0, 4.0 },
			{ 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 10 }, { 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5 },
			{ 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0 } };

	private HashMap<String, Integer> paperTypePriceList;
	private Calendar calendar = Calendar.getInstance();
	private HashMap<Integer, Integer> dayOfWeekCountMap;

	public NewsPaperData() {
		paperTypePriceList = new HashMap<String, Integer>() {
			{
				put("TOI", 0);
				put("Hindu", 1);
				put("ET", 2);
				put("BM", 3);
				put("HT", 4);
			}
		};
		populateDaysOfCurrentMonthCount();
	}

	public double calculateCurrentMonthlyExpense(String paperType) {

		double monthTotalBillNewsPaper = 0.0;

		for (int i = 1; i <= 7; i++) {
			monthTotalBillNewsPaper += this.dayOfWeekCountMap.get(i)
					* newsPaperCost[paperTypePriceList.get(paperType)][i - 1];
		}
		System.out.println("Bill for " + paperType + " monthly subscription :" + monthTotalBillNewsPaper);
		return monthTotalBillNewsPaper;
	}

	private void populateDaysOfCurrentMonthCount() {
		int monthDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);

		this.dayOfWeekCountMap = new HashMap<Integer, Integer>();

		int balanceDays = monthDays % 7;

		for (int i = 0; i < 7; i++) {
			this.dayOfWeekCountMap.put(firstDayOfMonth + i > 7 ? (firstDayOfMonth + i - 7) : firstDayOfMonth + i,
					(balanceDays) > 0 ? 5 : 4);
			balanceDays--;
		}

	}

}
