/**
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B

Example Input
Input 1:-
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

Example Output
Output 1:-
10 55 45 25 25

*/

public class ContinousSumQuery {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> out = new ArrayList<>();
        for(int i=0; i<A; i++){
            out.add(0);
        }
        for(ArrayList<Integer> b : B){
            int l = b.get(0)-1, r = b.get(1)-1, p = b.get(2);
            out.set(l, p + out.get(l));
            if(r+1<A){
                out.set(r+1, (0-p)+out.get(r+1));
            }
        }

        for(int i=1; i<A; i++){
            out.set(i, out.get(i-1) + out.get(i));
        }

        return out;
    }
}
