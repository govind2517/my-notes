/*
Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].

Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2

Example Output
Output 1:
[1, 2, 4, 3]
Output 2:
[6, 5, 2]
*/


public class ReverseInRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        while(B < C){
            int temp = A.get(B);
            A.set(B, A.get(C));
            A.set(C, temp);
            B++;
            C--;
        }
        return A;
    }
}
