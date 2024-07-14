/**
Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.
Example Input
Input 1:
 A = [0, 1, 0, 2]
Input 2:
A = [1, 2]

Example Output
Output 1:
1
Output 2:
0
*/

public class RainWaterTrapped {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int n = A.size();
        int maxL = A.get(0), maxR = A.get(n-1);
        int l = 1, r = n-2;
        // get intial left and right max
            while(l <n && maxL < A.get(l)){
                maxL = A.get(l);
                l++;
            }

            while(r >=0 && maxR < A.get(r)){
                maxR = A.get(r);
                r--;
            }

        int waterTrapped = 0;
        while(l <= r){
            if(maxL < maxR){
                if(maxL < A.get(l)) maxL = A.get(l);
                else waterTrapped += maxL - A.get(l);
                l++;
            }else{
                if(maxR < A.get(r)) maxR = A.get(r);
                else waterTrapped += maxR - A.get(r);
                r--;
            }
        }


        return waterTrapped;
    }
}

