/*

Problem Description
Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6

Problem Constraints
1 <= A <= 10^9

Example Input
Input 1:
5
Input 2:
10

Example Output
Output 1:
2
Output 2:
4

*/
public class CountFactors.java {
    public int solve(int A) {
        int cnt = 0;
        for(int a=1; a*a<=A; a++){
            if(A % a == 0){ // we got a as factor
                // now find b 
                int b = A/a;
                if(a==b){
                    cnt++; // for perfect square
                }else{
                    cnt += 2; // both factors are different
                }
            }
        }
        return cnt;
    }
}
