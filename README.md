# Problem Statement:
Suppose you have been keeping an eye on the stock market for a while, and you have been tracking the daily prices of a particular stock. You want to make a profit by buying and selling the stock at the right time.
Given the array of prices of the stock on each day, you need to figure out the best strategy to maximize your profit.
However, if the stock prices are constantly decreasing, there is no way for you to make a profit.
Example 1: Input: 7
arr[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation:
Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
Maximum Profit = 210 + 655 = 865
Example 2: Input: 5
arr[] = {4, 2, 2, 2, 4}
Output: 2
Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
Maximum Profit = 2 
Input format :
The first line contains an integer N, representing the number of days.
The second line contains N space-separated integers representing the stock prices on consecutive days.
Output format :
The output prints a single integer, which is the maximum profit that can be achieved.
Refer to the sample output for the formatting specifications.
Code constraints :
In this scenario, the given test cases will fall under the following constraints:
1 ≤ N ≤ 100
1 ≤ Price ≤ 103
Sample test cases :
Input 1 : 7
100 180 260 310 40 535 695
Output 1 : 865
Input 2 : 5
4 2 2 2 4
Output 2 : 2
Input 3 : 5
10 8 6 4 2
Output 3 :
0
Input 4 :
5
1 3 5 7 9
Output 4 :
8
