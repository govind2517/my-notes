/*
Problem Description
Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise

Example Input
Input 1:
A = [4, 3, 2, 6, 1]
B = 3
C = 11
Input 2:
A = [4, 2, 2, 5, 1]
B = 4
C = 6


Example Output
Output 1:
1
Output 2:
0

*/

public class SubArraySumWithLength {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int n = A.size();
        int sum = 0;
        
        // check first window
        for(int i=0; i<B; i++){
            sum += A.get(i);
        }
        if(sum == C)
            return 1;
        
        // start sliding window
        for(int i=B; i<n; i++){
            sum -= A.get(i-B);
            sum += A.get(i);
            if(sum == C)
                return 1;
        }
        return 0;
    }
}
