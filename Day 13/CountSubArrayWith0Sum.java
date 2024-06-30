/**
Problem Description
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 10^9+7

Example Input
Input 1:
 A = [1, -1, -2, 2]
Input 2:
 A = [-1, 2, -1]

Example Output
Output 1:
3
Output 2:
1

*/
public class CountSubArrayWith0Sum {
    public int solve(ArrayList<Integer> A) {
        HashMap<Long, Long> map = new HashMap<>();
        long preSum = 0l;
        map.put(0l, 1l);
        long cnt = 0;
        for(int i=0; i<A.size(); i++){
            preSum += A.get(i);
            if(map.containsKey(preSum)){
                cnt += map.get(preSum);
            }
            map.put(preSum, map.getOrDefault(preSum, 0l)+1);
        }

        int mod = 1000000007;
        return (int)cnt%mod;
    }
}
