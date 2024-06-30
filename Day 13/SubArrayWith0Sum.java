/**
Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1, else return 0.

Example Input
Input 1:
 A = [1, 2, 3, 4, 5]
Input 2:
 A = [4, -1, 1]

Example Output
Output 1:
 0
Output 2:
 1


*/
public class SubArrayWith0Sum {
  public int solve(ArrayList<Integer> A) {
      HashSet<Long> set = new HashSet<>();
      Long sum = 0l;
      for(int i=0; i<A.size(); i++){
          if(A.get(i) == 0) return 1;
          sum += (long)A.get(i);
          if(sum == 0) return 1;
          if(set.contains(sum)){
              return 1;
          }else{
              set.add(sum);
          }          
      }
      return 0;
  }
}
