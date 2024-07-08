/**
Given a number A, find if it is COLORFUL number or not.
If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:
A number can be broken into different consecutive sequence of digits. 
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245. 
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different

Example Input
Input 1:
 A = 23
Input 2:
 A = 236

Example Output
Output 1:
 1
Output 2:
 0
*/
public class ColorFulNumber {
    public int colorful(int A) {
        HashSet<Long> set = new HashSet<>();

        while(A > 0){
            Long B = (long) A;
            Long prod = 1l;
            while(B > 0){
                Long dg = B % 10;
                prod *= dg;
                if(set.contains(prod)){
                    return 0;
                }
                set.add(prod);
                B /= 10;
            }
            A /= 10;
        }

        return 1;
    }
}
