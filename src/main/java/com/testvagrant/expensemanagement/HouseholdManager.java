package com.testvagrant.expensemanagement;

public class HouseholdManager {

	public static void main(String[] args) {
		NewsPaperExpense paperBill = new NewsPaperExpense();

		HouseholdExpenses hh1 = new HouseholdExpenses();
		hh1.addExpense(paperBill);
		System.out.println(hh1.calculateExpense());

	}

}
