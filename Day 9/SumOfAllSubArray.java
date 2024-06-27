/*
Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [2, 1, 3]


Example Output
Output 1:
20
Output 2:
19

*/

public class SumOfAllSubArray {
    public Long subarraySum(ArrayList<Integer> A) {
        int n= A.size();
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += (Long.valueOf(n-i) * Long.valueOf(i+1) * Long.valueOf(A.get(i)));
        }
        return sum;
    }
}
