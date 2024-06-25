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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }

    int dfs(TreeNode node, int maxValAlongPath){
        if(node == null) return 0;

        int res = node.val >= maxValAlongPath ? 1 : 0;
        maxValAlongPath = Math.max(maxValAlongPath,node.val);
        res += dfs(node.right,maxValAlongPath);
        res += dfs(node.left,maxValAlongPath);
        return res;
    }
}
