/*
Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

Example Output
Output 1:
{15,10,13,16}
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        int n = A.size(), m=A.get(0).size();
        for(int col=0; col<m; col++){
            int sum = 0;
            for(int row=0; row<n; row++){
                sum += A.get(row).get(col);
            }
            out.add(sum);
        }
        return out;
    }
}


/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

Example Input
Input 1:
3 3 1 -2 -3 -4 5 -6 -7 -8 9
Input 2:
2 2 3 2 2 3


Example Output
Output 1:
 15 
Output 2:
 6 

*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int n =A.size();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=A.get(i).get(i);
        }
        return sum;
    }
}




