/**
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
Example Input
Input 1:
 A = [1, 2, 3, 4, -10] 
Input 2:
 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 

Example Output
Output 1:
 10 
Output 2:
 6
*/

public class MaxSumSubArray {
    public int maxSubArray(final List<Integer> A) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++){
            sum += A.get(i);
            max = Math.max(sum, max);
            if(sum < 0){
                sum = 0;
            }            
        }
        return max;
    }
}
