/*
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


Problem Constraints
0 <= n <= 10^3

Example Input
Input 1:
19
Input 2:
1


Example Output
Output 1:
8
Output 2:
0
*/

public class CountPrimes {
    public int solve(int A) {
        int cnt=0;
        for(int i=2; i<=A; i++){
            if(isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public boolean isPrime(int A){
        int factor = 0;
        for(int i=1; i*i<=A; i++){
            if(A%i==0){
                int b = A/i;
                if(b == i){
                    factor++;
                }else{
                    factor+=2;
                }
            }
            if(factor > 2){
                return false;
            }
        }
        return true;
    }
}
