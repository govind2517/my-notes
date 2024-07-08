/**
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.

Example Input
Input 1:
[2, 1, 2]
Input 2:
[1, 1, 1]

Example Output
Input 1:
2
Input 2:
1
*/

public class MajorityElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int n = A.size(), maj = -1, f = 0;
        for(int i=0; i<n; i++){
            if(f == 0){
                maj = A.get(i);
                f++;
            }else{
                if(A.get(i) == maj){
                    f++;
                }else{
                    f--;
                }
            }
        }

        f = 0;
        for(int i=0; i<n; i++){
            if(A.get(i) == maj){
                f++;
            }
        }

        if(f > n/2){
            return maj;
        }
        return -1;
    }
}
