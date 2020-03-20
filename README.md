# expensemanagement
Household Expense Management System

Coding Problem
We want to build an intelligent system that can calculate the monthly subscription expenses of
essential items for a household. For the sake of this assignment, we will go with the daily
newspaper subscription. Following table demonstrate prices of some of the prominent
newspapers on a daily basis, all prices in Indian rupees.
Based on the choice of papers one wants to subscribe, the program should calculate the
monthly expense for the household.

Monday Tuesday Wednesday Thursday Friday Saturday Sunday
TOI 3 3 3 3 3 5 6
Hindu 2.5 2.5 2.5 2.5 2.5 4 4
ET 2 2 2 2 2 2 10
BM 1.5 1.5 1.5 1.5 1.5 1.5 1.5
HT 2 2 2 2 2 4 4

The input to the program should be a comma separated list of papers that the consumer wants
to subscribe.
Calculate the total subscription price for the current month. You could use the calendar to
arrive at the total number of specific weekdays in the month and hard code the same.
The evaluation will happen on the following criteria:
- Demonstrate your understanding of OOPS concepts through the solution.
- Use relevant data structure to solve the problem efficiently.
- Think scalability. Currently we have only newspaper under Books & Periodical category,
Now if we want to add more items to the subscription list across different categories at
varying frequency (Daily, Weekly, BiWeekly etc). e.g. we add milk under Dairy Category
with a daily frequency, any magazine under Books Category with a weekly frequency
etc. The solution that you submit should be easily extendible to add new items under
different categories at given frequency to arrive at total subscription cost.


Sample Output 

Household Expenses for current month :March

Monthly household expesne details for Jishnu
Bill for TOI monthly subscription :113.0
Bill for ET monthly subscription :94.0
Bill for BM monthly subscription :46.5
Total monthly bill :253.5

Monthly household expesne details for Jignesh
Bill for TOI monthly subscription :113.0
Bill for Hindu monthly subscription :89.5
Total monthly bill :202.5

Monthly household expesne details for Kishore
Bill for TOI monthly subscription :113.0
Bill for ET monthly subscription :94.0
Bill for BM monthly subscription :46.5
Bill for Hindu monthly subscription :89.5
Bill for HT monthly subscription :78.0
Total monthly bill :421.0
