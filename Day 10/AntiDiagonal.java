/*
Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:
1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:
1 0
2 3
4 0
*/

public class AntiDiagonal {
    public int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] out = new int[n*2-1][n];
        
        //now iterate over col
        int outRow = 0, outCol = 0;
        for(int col=0; col<n; col++){
            int r=0;
            int c=col;
            while(r < n && c >= 0){
                out[outRow][outCol] = A[r][c];
                outCol++;
                r++;
                c--;
            }
            outCol=0;
            outRow++;
        }

        // now iterate over row
        for(int row=1; row<n; row++){
            int c = n-1;
            int r = row;
            while(r < n && c >= 0){
                out[outRow][outCol] = A[r][c];
                outCol++;
                r++;
                c--;
            }
            outCol=0;
            outRow++;
        }

        return out;
    }
}
