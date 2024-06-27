/*
Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = 4
Input 2:
A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65


Example Output
Output 1:
6
Output 2:
36

*/

public class GoodSubArrayCnt {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size(), cnt=0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += A.get(j);
                // get length of array
                int len = j-i+1;
                if(len%2==0){
                    if(sum < B){
                        cnt++;
                    }
                }else{
                    if(sum > B){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
