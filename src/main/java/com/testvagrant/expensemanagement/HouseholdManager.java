package com.testvagrant.expensemanagement;

public class HouseholdManager {

	public static void main(String[] args) {
		NewsPaperExpense paperSubscription = new NewsPaperExpense("TOI","ET","BM");
		HouseholdExpenses hh1 = new HouseholdExpenses();
		hh1.addExpense(paperSubscription);
		System.out.println(hh1.calculateExpense());

	}

}
