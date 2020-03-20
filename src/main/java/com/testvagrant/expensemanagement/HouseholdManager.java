package com.testvagrant.expensemanagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HouseholdManager {

	public static void main(String[] args) {
		NewsPaperExpense paperSubscription1 = new NewsPaperExpense("TOI","ET","BM");
		NewsPaperExpense paperSubscription2 = new NewsPaperExpense("TOI","Hindu");
		NewsPaperExpense paperSubscription3 = new NewsPaperExpense("TOI","ET","BM","Hindu","HT");
		
		HouseholdExpenses household1 = new HouseholdExpenses();
		HouseholdExpenses household2 = new HouseholdExpenses();
		HouseholdExpenses household3 = new HouseholdExpenses();
		
		System.out.println("Household Expenses for current month :"
				+ new SimpleDateFormat("MMMM").format(Calendar.getInstance().getTime()));
		
		household1.addExpense(paperSubscription1);
		System.out.println("Total monthly Bill for house hold1: " + household1.calculateExpense());

		household2.addExpense(paperSubscription2);
		System.out.println("Total monthly Bill for house hold2:  " + household2.calculateExpense());

		household3.addExpense(paperSubscription3);
		System.out.println("Total monthly Bill for house hold3:  " + household3.calculateExpense());
	}

}
