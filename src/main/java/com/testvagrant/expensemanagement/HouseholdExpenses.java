package com.testvagrant.expensemanagement;

import java.util.ArrayList;

public class HouseholdExpenses implements Household {

	ArrayList<Expense> expenseList;
	private double monthlyExpense = 0.0;

	public HouseholdExpenses() {
		expenseList = new ArrayList<Expense>();
	}

	public void addExpense(Expense newExpense) {
		expenseList.add(newExpense);
	}

	public void removeExpense(Expense deleteExpense) {
		expenseList.remove(expenseList.indexOf(deleteExpense));

	}

	public double calculateExpense() {
		for (Expense expense : expenseList) {
			monthlyExpense += expense.getMonthlyExpesne();
		}
		return monthlyExpense;

	}

}
