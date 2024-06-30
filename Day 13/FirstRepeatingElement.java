/**
Problem Description
Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
If there is no repeating element, return -1.

Example Input
Input 1:
 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:
 A = [6, 10, 5, 4, 9, 120]


Example Output
Output 1:
 5
Output 2:
 -1


*/
public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: A){
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        for(int a: A){
            if(map.get(a) > 1)
                return a;
        }
        return -1;
    }
}
