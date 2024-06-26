/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]

Example Output
Output 1:
[10, 5]
Output 2:
[2, 4]

*/

public class RangeSumQuery {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> pSum = new ArrayList<>();
        pSum.add(Long.valueOf(A.get(0)));
        for(int i=1; i<A.size(); i++)
        {
            pSum.add(pSum.get(i-1) + A.get(i));
        }
        ArrayList<Long> ans = new ArrayList<Long>();
        for(int i=0; i<B.size(); i++){
            ArrayList<Integer> q = B.get(i);
            ans.add(getPrefixSum(pSum, q.get(0), q.get(1)));
        }

        return ans;
    }

    public Long getPrefixSum(ArrayList<Long> pSum, int l, int r){
        if(l == 0)
            return pSum.get(r);
        
        return pSum.get(r)-pSum.get(l-1);
    }
}
