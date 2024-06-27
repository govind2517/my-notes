/*
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.

Example Input
Input 1:
 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
Input 2:
 A = [5, 17, 100, 11]
 B = 20


Example Output
Output 1:
 2
Output 2:
 1

 
*/

public class MinSwaps {
    public int solve(ArrayList<Integer> A, int B) {
        // here first find the <= element count to set window size
        // becoz window is required to know consecutive element
        int k = 0, n=A.size();
        for(int i=0; i<n; i++){
            if(A.get(i) <= B){
                k++;
            }
        }        
        
        // check if there are no element less than B then no swap needed as all element are greater
        if(k == 0) return 0;

        int x = 0;
        // now check in first window like how many swap reuired to set all <= element together
        for(int i=0; i<k; i++){
            if(A.get(i) > B){
                x++;
            }
        }

        int minSwap = x;

        // now check it other window by sliding it
        for(int i=k; i<n; i++){
            if(A.get(i) > B){
                x++;
            }
            if(A.get(i-k) > B){
                x--;
            }
            minSwap = Math.min(minSwap, x);
        }
        return minSwap;        
    }
}
