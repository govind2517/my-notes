/**
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.

Example Input
Input 1:
A = "010"
Input 2:
A = "111"

Example Output
Output 1:
[1, 1]
Output 2:
[]
*/

public class FlipBinaryString {
    public ArrayList<Integer> flip(String A) {
        // here kaden's can be used by considering 1 to -1 and 0 to +1 in sum as we are flipping it.
        int currentSum = 0, maxSum = 0, tempStart = 0, start=0, end = 0;
        boolean found = false;
        for(int i=0; i<A.length(); i++){
            currentSum += (A.charAt(i) == '1' ? -1 : 1);

            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
                found = true;
            }

            if(currentSum < 0){
                currentSum = 0;
                tempStart = i+1;
            }
        }

        ArrayList<Integer> out = new ArrayList<Integer>();
        if(!found) return out;
        
        out.add(start+1);
        out.add(end+1);
        return out;
    }
}
