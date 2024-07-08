/**
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.
Note: Read-only array means that the input array should not be modified in the process of solving the problem

Example Input
Input 1:
[1 2 3 1 1]
Input 2:
[1 2 3]

Example Output
Output 1:
1
Output 2:
-1

*/

public class Nby3 {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        if(a.size() <= 2){
            return a.get(0);
        }
    int f1=0, f2=0, first=0, second = 0, n = a.size();
    for(int i=0; i<n; i++){
        if(first == a.get(i)){
            f1++;
        }else if(second == a.get(i)){
            f2++;
        }else if(f1 == 0){
            first = a.get(i);
            f1++;
        }else if(f2 == 0){
            second = a.get(i);
            f2++;
        }
        else{
            f1--;
            f2--;
        }
    }

  f1=0; f2=0;
    for(int i=0; i<n; i++){
        if(a.get(i) == first){
            f1++;
        }else if(a.get(i) == second){
            f2++;
        }
    }
    //System.out.println(first+" :: f1 :: "+f1+" second :: "+second+" :: f2 :: "+f2);
    if(f1 > n/3){
        return first;
    }else if(f2 > n/3){
        return second;
    }
    return -1;
    }
}
