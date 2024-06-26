/*

Problem Description
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.

Example Input
Input 1:
A = [1, 2, 3, 4]
B = 2
Input 2:
A = [2, 5, 6]
B = 1

Example Output
Output 1:
[3, 4, 1, 2]
Output 2:
[6, 2, 5]

*/

public class RotateArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        B %= A.size(); // to make B in the bound of size of array
        reverse(A, 0, A.size()-1);
        reverse(A, 0, B-1);
        reverse(A, B, A.size()-1);
        return A;
    }

    public void reverse(ArrayList<Integer> A, int s, int e){
        while(s < e){
            int t = A.get(s);
            A.set(s, A.get(e));
            A.set(e, t);
            s++;
            e--;
        }
    }
}
