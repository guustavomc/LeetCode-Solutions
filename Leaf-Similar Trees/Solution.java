/*Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.

For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

Example 1:

Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true

Example 2:

Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false

Constraints:

The number of nodes in each tree will be in the range [1, 200].
Both of the given trees will have values in the range [0, 200].*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafsTree1 = new ArrayList<>();
        List<Integer> leafsTree2 = new ArrayList<>();

        getLeafs(root1,leafsTree1);
        getLeafs(root2,leafsTree2);
        

        return leafsTree1.equals(leafsTree2);
    }

    public void getLeafs(TreeNode node, List<Integer> leafs){
       
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            leafs.add(node.val);
        }


        getLeafs(node.left, leafs);
        getLeafs(node.right, leafs);

    }
}
