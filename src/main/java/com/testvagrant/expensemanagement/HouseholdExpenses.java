package com.testvagrant.expensemanagement;

import java.util.ArrayList;

public class HouseholdExpenses implements Household {
	private String ownerName;
	private String city;
	private String address;

	ArrayList<Expense> expenseList;
	private double monthlyExpense = 0.0;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Expense> getExpenseList() {
		return expenseList;
	}

	public void setExpenseList(ArrayList<Expense> expenseList) {
		this.expenseList = expenseList;
	}

	public double getMonthlyExpense() {
		return monthlyExpense;
	}

	public void setMonthlyExpense(double monthlyExpense) {
		this.monthlyExpense = monthlyExpense;
	}

	public HouseholdExpenses(String ownerName, String city, String address) {
		this.ownerName = ownerName;
		this.city = city;
		this.address = address;

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
