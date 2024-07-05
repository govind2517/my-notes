/**
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.

Input 1:
[1,2,3,4]
[5,6,7,0]
[9,2,0,4]

Output 1:
[1,2,0,0]
[0,0,0,0]
[0,0,0,0]

*/

public class RowToColumnZero {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size(), m = A.get(0).size();
        boolean firstRowHasZero = false, firstColHasZero = false;

        // checking in firstCol
        for(int i=0; i<n; i++){
            if(A.get(i).get(0) == 0){
                firstColHasZero = true; break;
            }
        }

        // checking in firstRow
        for(int j=0; j<m; j++){
            if(A.get(0).get(j) == 0){
                firstRowHasZero = true; break;
            }
        }

        // now use firstRow and firstCol for updating col
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(A.get(i).get(j) == 0){
                    A.get(i).set(0, 0);
                    A.get(0).set(j, 0);
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(A.get(i).get(0) == 0 || A.get(0).get(j) == 0){
                    A.get(i).set(j, 0);
                }
            }
        }

        // now update firstRow and firstCol
        if(firstRowHasZero){
            for(int j=0; j<m; j++){
                A.get(0).set(j, 0);
            }
        }

        if(firstColHasZero){
            for(int i=0; i<n; i++){
                A.get(i).set(0, 0);
            }
        }

        return A;

    }
}
