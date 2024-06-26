/*

Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.

Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [5, 2, 1, 4]


Example Output
Output 1:
[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Output 2:
[[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]

*/

public class GenerateAllSubArray {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int k=i; k<=j; k++){
                    row.add(A.get(k));
                }
                out.add(row);
            }
        }
        return out;
    }
}
