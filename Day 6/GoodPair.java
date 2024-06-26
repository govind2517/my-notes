/*
Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

Example Input
Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4

Example Output
Output 1:
1
Output 2:
0
Output 3:
1

*/

public class GoodPair {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> set =  new HashSet<>();
        for(int i=0; i<A.size(); i++){
            int d = B - A.get(i);
            if(set.contains(d)){
                return 1;
            }
            set.add(A.get(i));
        }
        return 0;
    }
}




/** Time to equality ***/
/*
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Example Input
A = [2, 4, 1, 3, 2]

Example Output
8

--- Approach: is to find the max element then substract each element with max element. Then add that difference in it.


/*** Count of element **/
/*
Problem Description
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.

Example Input
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output
Output 1:
2
Output 2:
1

--- Approach: as we have to find the number of element having atleast 1 greater than itself. then if we find max element from it then whatever element less than greater element can be consider as valid element

*/

