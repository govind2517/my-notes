/**
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7

*/

public class LengthOfLongestConsecutiveOnes {
    public int solve(String A) {
        int n = A.length(), cnt1=0;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(A.charAt(i) == '1'){
                cnt1++;
            }
        }
        if(cnt1 == n) return n;

        for(int i=0; i<n; i++){
            int cnt = 0;
            if(A.charAt(i) == '0'){
                cnt++; // replacing 0 to 1
                int j = i-1;
                while(j>=0){
                    if(A.charAt(j) == '1'){
                        cnt++;
                    }else{
                        break;
                    }
                    j--;
                }
                j = i+1;
                while(j<n){
                    if(A.charAt(j) == '1'){
                        cnt++;
                    }else{
                        break;
                    }
                    j++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans > cnt1 ? ans-1 : ans;
    }
}
