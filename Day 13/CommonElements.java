/**
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
NOTE:
Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.

Example Input
Input 1:
 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:
 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:
 [1, 2, 2]
Output 2:
 [2, 10]
 
*/
public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
        }

        ArrayList<Integer> out = new ArrayList<>();
        // iterate over B to check the element
        for(int b: B){
            if(map.containsKey(b) && map.get(b) > 0){
                out.add(b);
                map.put(b, map.get(b)-1);
            }
        }
        return out;
    }
}
