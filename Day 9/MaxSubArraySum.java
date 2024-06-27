/*
Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.

Example Input
Input 1:
A = 5
B = 12
C = [2, 1, 3, 4, 5]
Input 2:
A = 3
B = 1
C = [2, 2, 2]


Example Output
Output 1:
12
Output 2:
0
*/

public class MaxSubArraySum {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int maxSum=0;
        for(int i=0; i<A; i++){
            int sum = 0;
            for(int j=i; j<A; j++){
                sum += C.get(j);
                if(sum == B){
                    return sum;
                }

                if(sum < B){
                    maxSum = Math.max(sum, maxSum);
                }else{
                    break;
                }
            }
        }
        return maxSum;
    }
}
