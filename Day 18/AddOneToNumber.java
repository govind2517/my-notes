/**
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.
NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

Example Input
Input 1:
[1, 2, 3]

Example Output
Output 1:
[1, 2, 4]

*/
public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> out = new ArrayList<Integer>();
        A.set(n-1, A.get(n-1)+1);
        int carry = 0;
        for(int i=n-1; i>=0; i--){
            int sum = A.get(i) + carry;
            carry = sum / 10;
            A.set(i, sum % 10);
        }
        // what if carry is still 1
        if(carry == 1){
            out.add(1);
            for(int i=0; i<n; i++){
                out.add(A.get(i));
            }
        }else{
            // check if start with zero and remove those zero
            int i=0;
            for(; i<n; i++){
                if(A.get(i) == 0) continue;
                break;    
            }
            for(int j=i; j<n; j++){
                out.add(A.get(j));
            }
        }
        return out;
    }
}
