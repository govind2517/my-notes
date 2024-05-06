/*
Given an array of Integers, find the length of smallest subarray which contains both max and min elements of array.

A = [3 6 2 1 6 5] Ans=> 2

A = [2 2 6 4 5 1 5 2 6 4 1] 
min = 1 max = 6 and Ans => 3
*/

// Bruteforce: Generate all subarrays, iterate and check 
// TC => O(n^3) and SC => O(1)

/* optimal approach
1. Find min and max
2. Iterate over array from 0 to n-1.
3. For all max elements, find the closest min element.
4. Or if min is found, then find the closest max element.
*/

public int findSmallestLength(int[] A){
	int n = A.length;
	//calculate min and max
	int idx_min = -1;
	int idx_max = -1;
	int ans = n; // worst case answer
	
	for(int i=0; i<n; i++){
		if(A[i] == min){
			if(idx_max != -1){
				ans = min(ans, i-idx_max+1);
			}
			idx_min = i;
		}else if(A[i] == max){
			if(idx_min != -1){
				ans = min(ans, idx_min+1);
			}
			idx_max = i; 
		}
	}
	return ans;
}