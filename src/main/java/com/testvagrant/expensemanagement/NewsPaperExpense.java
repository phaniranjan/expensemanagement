
package com.testvagrant.expensemanagement;

import com.testvagrant.expensemanagement.data.NewsPaperData;

import java.util.ArrayList;
import java.util.Collections;

public class NewsPaperExpense implements Expense {

	private double monthlyExpense = 0.0;
	private ArrayList<String> optedNewsPapers;
	private NewsPaperData newsPaperData;

	public NewsPaperExpense(String... subscribedNewsPapers) {
		optedNewsPapers = new ArrayList<String>();
		Collections.addAll(optedNewsPapers, subscribedNewsPapers);
		newsPaperData = new NewsPaperData();

	}

	public double getMonthlyExpesne() {
		
		for (String paperType : optedNewsPapers) {

			monthlyExpense += newsPaperData.calculateCurrentMonthlyExpense(paperType);
		}

		return monthlyExpense;
	}

}
