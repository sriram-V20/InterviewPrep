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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelValues = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();
                levelValues.add(top.val);
                if(top.left != null) queue.add(top.left);
                if(top.right != null) queue.add(top.right);
            }
            res.add(levelValues);
        }
        return res;
    }
}
