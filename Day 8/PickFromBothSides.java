/*

Problem Description
You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.

Example Input
Input 1:
 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:
 A = [ 2, 3, -1, 4, 2, 1 ]
 B = 4


Example Output
Output 1:
 8
Output 2:
 9

 */

public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> preSum = new ArrayList<Integer>();
        int n = A.size();
        preSum.add(A.get(0));
        for(int i=1; i<n; i++){
            preSum.add(preSum.get(i-1) + A.get(i));
        }
        
        int maxVal = Integer.MIN_VALUE;
        for(int i=0, j=n-B; i<=B; i++, j++){
            int sum = 0;
            // leftSum
            if(i!=0)
                sum += getPrefixSum(preSum, 0, i-1);
            //rightSum
                sum += getPrefixSum(preSum, j, n-1);
            maxVal = Math.max(sum, maxVal);
        }
        return maxVal;
    }

    public int getPrefixSum(ArrayList<Integer> pSum, int l, int r){
        if(l==0)
            return pSum.get(r);
        
        return pSum.get(r) - pSum.get(l-1);
    }
}
