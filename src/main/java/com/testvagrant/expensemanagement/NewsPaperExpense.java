
package com.testvagrant.expensemanagement;

import com.testvagrant.expensemanagement.data.NewsPaperData;

import java.util.ArrayList;
import java.util.Collections;

public class NewsPaperExpense implements Expense {

	private String expenseType;
	private String expesneFrequency;

	private double monthlyExpense = 0.0;
	private ArrayList<String> optedNewsPapers;
	private NewsPaperData newsPaperData;

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getExpesneFrequency() {
		return expesneFrequency;
	}

	public void setExpesneFrequency(String expesneFrequency) {
		this.expesneFrequency = expesneFrequency;
	}

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
