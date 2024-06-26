/*
Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.

Problem Constraints
1 <= A <= 10^6

Example Input
Input 1:
A = 4
Input 2:
A = 6


Example Output
Output 1:
0 
Output 2:
1 

*/

public class PerfectNumbers {
    public int solve(int A) {
        if(A==1) return 0;
        int sum = 1;
        for(int a=2; a*a<=A; a++){
            if(A%a==0){
                int b = A/a;
                if(a==b){
                    sum += a;
                }else{
                    sum += a;
                    sum += b;
                }
            }
        }

        if(sum == A){
            return 1;
        }
        return 0;
    }
}
