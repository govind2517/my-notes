/*
Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Example Input
Input 1:
A = [2, 1, 6, 4]
Input 2:
A = [1, 1, 1]

Example Output
Output 1:
1
Output 2:
3

*/

public class SpecialIndex {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> evenSum = new ArrayList<Integer>();
        ArrayList<Integer> oddSum = new ArrayList<Integer>();
        evenSum.add(A.get(0));
        oddSum.add(0);
        for(int i=1; i<A.size(); i++){
            if(i%2==0){
                // evenIndex
                evenSum.add(evenSum.get(i-1) + A.get(i));
                oddSum.add(oddSum.get(i-1));
            }else{
                // oddIndex
                oddSum.add(oddSum.get(i-1) + A.get(i));
                evenSum.add(evenSum.get(i-1));
            }
        }

        // when we remove any index it left side will be as it is but right side index will get changed.
        int cnt = 0;
        int n = A.size();
        for(int i=0; i<A.size(); i++){
            int evenIndexSum = 0;
            int oddIndexSum = 0;
            if(i == 0){
                evenIndexSum = getPrefixSum(oddSum, i+1, n-1);
                oddIndexSum = getPrefixSum(evenSum, i+1, n-1);
            }else{
                evenIndexSum = getPrefixSum(evenSum, 0, i-1) + getPrefixSum(oddSum, i+1, n-1);
                oddIndexSum = getPrefixSum(oddSum, 0, i-1) + getPrefixSum(evenSum, i+1, n-1);
            }
            if(evenIndexSum == oddIndexSum)
                cnt++;
        }
        
        return cnt;
    }

    public int getPrefixSum(ArrayList<Integer> pSum, int l, int r){
        if(l==0)
            return pSum.get(r);
        
        return pSum.get(r) - pSum.get(l-1);
    }
}
