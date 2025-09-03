/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows==1){
            return result;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> previousRow = result.get(i-1);
            List<Integer> newRow = new ArrayList<>();
            for(int j=0;j<previousRow.size()+1;j++){
                if(j==0 || j==previousRow.size()){
                    newRow.add(1);
                }
                else{
                    newRow.add(previousRow.get(j-1)+previousRow.get(j));
                }
            }
            result.add(newRow);
        }
        return result;
    }
}
