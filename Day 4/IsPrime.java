/*
Problem Description
Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer.


Problem Constraints
1 <= A <= 109


Example Input
Input 1:
A = 5
Input 2:
A = 10


Example Output
Output 1:
1
Output 2:
0

*/


public class IsPrime {
    public int solve(int A) {
        if(getFatorsCnt(A) == 2){
            return 1;
        }
        return 0;
    }

    public int getFatorsCnt(int A){
        int cnt = 0;
        for(int a = 1; a*a<=A; a++){
            if(A%a==0){
                int b = A/a;
                if(a==b){
                    cnt++;
                }else{
                    cnt += 2;
                }
            }
            if(cnt > 2){
                return cnt;
            }
        }
        return cnt;
    }
}
