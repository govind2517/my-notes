/*
Problem Description
You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

Example Input
Input 1:
 A = "ABCGAG"
Input 2:
 A = "GAB"


Example Output
Output 1:
 3
Output 2:
 0

*/
public class SpecialSubSeq {
    public int solve(String A) {
        int n = A.length();
        int gCnt=0, cnt=0;
        int pow = 1000000007;
        for(int i=n-1; i>=0; i--){
            if(A.charAt(i) == 'G'){
                gCnt++;
            }
            if(A.charAt(i) == 'A'){
                cnt = (cnt%pow + gCnt%pow)%pow;
            }
        }
        return cnt;
    }
}
