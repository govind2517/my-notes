/**
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Example Input
Input 1:
A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:
A = ["abab", "ab", "abcd"];

Example Output
Output 1:
"a"
Output 2:
"a
*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        int minLen = Integer.MAX_VALUE, n = A.size();
        // find the min length of string which will be applicable for all string present in list,
        // so that we should not get IndexOutOfBound exception
        for(int i=0; i<n; i++){
            minLen = Math.min(A.get(i).length(), minLen);
        }
        
        // once minLen is found iterate 0th string only and check in all other string having same character present or not
        // if not present then we should return the value calculated till now.
        // otherwise make string by appending that char
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<minLen; i++){
            char ch = A.get(0).charAt(i);
            for(int j=1; j<n; j++){
                if(A.get(j).charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
