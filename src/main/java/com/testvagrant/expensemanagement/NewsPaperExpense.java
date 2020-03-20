
package com.testvagrant.expensemanagement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;

public class NewsPaperExpense implements Expense {

	final double newsPaperCost[][] = { { 3.0, 3.0, 3.0, 3.0, 3.0, 5.0, 6.0 }, { 2.5, 2.5, 2.5, 2.5, 2.5, 4.0, 4.0 },
			{ 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 10 }, { 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5 },
			{ 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0 } };
	private HashMap<String, Integer> paperTypePriceList = new HashMap<String, Integer>() {
		{
			put("TOI", 0);
			put("Hindu", 1);
			put("ET", 2);
			put("BM", 3);
			put("HT", 4);
		}

	};

	private double monthlyExpense = 0.0;
	private ArrayList<String> optedNewsPapers;

	public NewsPaperExpense(String... subscribedNewsPapers) {
		optedNewsPapers = new ArrayList<String>();
		Collections.addAll(optedNewsPapers, subscribedNewsPapers);

	}

	double calculateCurrentMonthlyExpense(String paperType) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		int monthDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("Month " + month + " monthDays " + monthDays);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("First day of Month is: " + firstDayOfMonth);
		System.out.println(calendar.getTime());

		HashMap<Integer, Integer> dayOfWeekCountMap = new HashMap<Integer, Integer>();

		int balanceDays = monthDays % 7;

		for (int i = 0; i < 7; i++) {
			dayOfWeekCountMap.put(firstDayOfMonth + i > 7 ? (firstDayOfMonth + i - 7) : firstDayOfMonth + i,
					(balanceDays) > 0 ? 5 : 4);
			balanceDays--;
		}

		System.out.println(dayOfWeekCountMap.toString());

		double monthTotalBillNewsPaper = 0.0;

		for (int i = 1; i <= 7; i++) {
			monthTotalBillNewsPaper += dayOfWeekCountMap.get(i)
					* newsPaperCost[paperTypePriceList.get(paperType)][i - 1];
		}
		System.out.println("Month Total bill for " + paperType + " :" + monthTotalBillNewsPaper);
		return monthTotalBillNewsPaper;
	}

	public double getMonthlyExpesne() {
		for (String paperType : optedNewsPapers) {
			monthlyExpense += calculateCurrentMonthlyExpense(paperType);
		}

		return monthlyExpense;
	}

}
