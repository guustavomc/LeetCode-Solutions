/*An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

Example 1:

Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.

Example 2:

Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.
 
Constraints:
n == matrix.length == matrix[i].length
1 <= n <= 100
1 <= matrix[i][j] <= n*/
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<matrix.length; i++){
            HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
            for(int j=0; j<matrix[i].length; j++){
                uniqueNumbers.add(matrix[i][j]);
            }
            if(uniqueNumbers.size()!=n){
                return false;
            }
        }

        for(int i=0; i<matrix.length; i++){
            HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
            for(int j=0; j<matrix[i].length; j++){
                uniqueNumbers.add(matrix[j][i]);
            }
            if(uniqueNumbers.size()!=n){
                return false;
            }
        }

        return true;
    }
}
