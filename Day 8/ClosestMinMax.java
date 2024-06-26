/*
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.
Example Input
Input 1:
A = [1, 3, 2]
Input 2:
A = [2, 6, 1, 6, 9]

Example Output
Output 1:
 2
Output 2:
 3

*/
public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int minVal = A.get(0), maxVal = A.get(0);
        int n = A.size();
        for(int i=0; i<n; i++){
            if(A.get(i) < minVal){
                minVal = A.get(i);
            }
            if(A.get(i) > maxVal){
                maxVal = A.get(i);
            }
        }

        // now find the min size subarray
        int minIndex = -1, maxIndex = -1, minSize = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(A.get(i) == minVal){
                // got minIndex
                minIndex = i;
                if(maxIndex != -1){
                    minSize = Math.min((i - maxIndex) + 1, minSize);
                }
            }

            if(A.get(i) == maxVal){
                // got maxIndex
                maxIndex = i;
                if(minIndex != -1){
                    minSize = Math.min((i - minIndex) + 1, minSize);
                }
            }
        }
        return minSize;
    }
}
