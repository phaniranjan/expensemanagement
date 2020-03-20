package com.testvagrant.expensemanagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HouseholdManager {

	public static void main(String[] args) {
		NewsPaperExpense paperSubscription1 = new NewsPaperExpense("TOI", "ET", "BM");
		NewsPaperExpense paperSubscription2 = new NewsPaperExpense("TOI", "Hindu");
		NewsPaperExpense paperSubscription3 = new NewsPaperExpense("TOI", "ET", "BM", "Hindu", "HT");

		HouseholdExpenses household1 = new HouseholdExpenses("Jishnu", "Bengaluru", "Marathahalli");
		HouseholdExpenses household2 = new HouseholdExpenses("Jignesh", "Hyderabad", "Gandipet");
		HouseholdExpenses household3 = new HouseholdExpenses("Kishore", "Kurnool", "BirlaGate");

		System.out.println("Household Expenses for current month :"
				+ new SimpleDateFormat("MMMM").format(Calendar.getInstance().getTime()));

		printHouseHoldBillingDetails(paperSubscription1, household1);

		printHouseHoldBillingDetails(paperSubscription2, household2);

		printHouseHoldBillingDetails(paperSubscription3, household3);

	}

	private static void printHouseHoldBillingDetails(NewsPaperExpense paperSubscription, HouseholdExpenses household) {

		System.out.println("Monthly household expesne details for " + household.getOwnerName());
		household.addExpense(paperSubscription);
		System.out.println("Total monthly bill :" + household.calculateExpense());
		System.out.println("");
	}

}
