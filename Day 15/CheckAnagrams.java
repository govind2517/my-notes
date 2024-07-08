/**
You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.
Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.

Example Input
Input 1:
A = "cat"
B = "bat"
Input 2:
A = "secure"
B = "rescue"

Example Output
Output 1:
0
Output 2:
1

*/
public class CheckAnagrams {
    public int solve(String A, String B) {
        int n = A.length(), m = B.length();
        if(n!=m) return 0;

        int[] chars = new int[26];
        for(int i=0; i<n; i++){
            chars[A.charAt(i) - 'a']++; 
            chars[B.charAt(i) - 'a']--; 
        }

        for(int i=0; i<26; i++){
            if(chars[i] != 0) return 0;
        }

        return 1;
    }
}
