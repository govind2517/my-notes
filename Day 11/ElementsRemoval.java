/*
Problem Description
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.



Example Input
Input 1:
 A = [2, 1]
Input 2:
 A = [5]


Example Output
Output 1:
 4
Output 2:
 5
*/

public class ElementsRemoval {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        int sum = 0;
        /*
        for(int i=0; i<A.size(); i++){
            sum += A.get(i);
        }
        int total = sum;
        for(int i=0; i<A.size(); i++){
            sum -= A.get(i);
            total += sum;
        }
        return total;
        */
        // in above approach we are just doing addition and substraction
        // but same can achieve using multiplication 
        for(int i=0; i<A.size(); i++){
            sum += (A.get(i) * (i+1));
        }
        return sum;
    }
}
