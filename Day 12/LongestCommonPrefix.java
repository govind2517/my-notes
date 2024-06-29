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
