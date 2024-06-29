/**
Problem Description
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Example Input
Input 1:
 A = [3, 5, 1]
Input 2:
 A = [2, 4, 1]


Example Output
Output 1:
 1
Output 2:
 0
*/

public class ArithmeticProgression {
    public int solve(ArrayList<Integer> A) {
        if(A.size() <= 2) return 1;
        Collections.sort(A);
        int diff = A.get(1) - A.get(0);
        for(int i=2; i<A.size(); i++){
            if(diff != (A.get(i) - A.get(i-1))){
                return 0; 
            }
        }
        return 1;
    }
}
