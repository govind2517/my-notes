/**
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.

Example Input
Input 1:
 A = [3, 2, 1, 3]
Input 2:
 A = [1, 1, 3, 3]


Example Output
Output 1:
 1
Output 2:
 -1

*/

public class NodelInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        if(A.get(0) == 0) return 1;
        for(int i=1; i<A.size(); i++){
            if(i == A.get(i) && (A.get(i-1) != A.get(i))){
                return 1;
            }
        }
        return -1;
    }
}
