/**
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).

Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba

Example Output
Output 1:
"aaabaaa"
Output 2:
"abba"

*/

public class LongestPalindromeString {
    public String longestPalindrome(String A) {
        // Approach: we need to check even and odd palindrome number both, as both can't be done in same logic.
        // So first check odd len palindrome max string considering i as middle element
        // then calculate even len palindrome max string considering i and i+1 as both side element
        int n = A.length(), startIndex = 0, endIndex = 0;
        int maxLen = 1;

        for(int i=0; i<n; i++){
            // odd len check
            int len = 1, l=i-1, r = i+1;
            while(l >= 0 && r < n){
                if(A.charAt(l) != A.charAt(r)){
                    break;
                }
                len += 2;
                l--;
                r++;
            }
            if(maxLen < len){
                maxLen = len;
                startIndex = l+1;
                endIndex = r-1;
            }

            // even length check
            l = i; r = i+1; len = 0;
            while(l >= 0 && r < n){
                if(A.charAt(l) != A.charAt(r)){
                    break;
                }
                len += 2;
                l--;
                r++;
            }

            if(maxLen < len){
                maxLen = len;
                startIndex = l+1;
                endIndex = r-1;
            }
        }

        return A.substring(startIndex, endIndex+1);
    }
}
