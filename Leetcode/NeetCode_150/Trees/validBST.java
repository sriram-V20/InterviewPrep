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
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root,null,null);
    }

    public boolean isValidBSTHelper(TreeNode root,Integer minVal, Integer maxVal){
        if(root == null) return true;

        if((minVal != null && root.val <= minVal) || (maxVal != null && root.val >= maxVal)) return false;


        return isValidBSTHelper(root.left,minVal,root.val) && isValidBSTHelper(root.right,root.val,maxVal);
    }
}
