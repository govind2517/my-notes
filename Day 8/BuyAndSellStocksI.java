/*

Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

Example Input
Input 1:
A = [1, 2]
Input 2:
A = [1, 4, 5, 2, 4]


Example Output
Output 1:
1
Output 2:
4

*/

public class BuyAndSellStocksI {
    public int maxProfit(final List<Integer> A) {
        int maxPro = 0;
        int n = A.size();
        if(n <= 1) return maxPro;
        int maxVal = A.get(n-1);
        for(int i=n-2; i>=0; i--){
            if(A.get(i) < maxVal){
                int profit = maxVal - A.get(i);
                maxPro = Math.max(maxPro, profit);
            }else{
                maxVal = A.get(i);
            }
        }
        return maxPro;
    }
}
