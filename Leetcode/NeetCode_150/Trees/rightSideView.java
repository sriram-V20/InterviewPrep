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
    /*
            1
        2       3
    4     5 6       7
    queue = [1]
    res  = []
    level = 0
    */
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();
                if(level == res.size()) res.add(top.val);
                if(top.right != null) queue.add(top.right);
                if(top.left != null) queue.add(top.left);
            }
            level++;
        }
        return res;
    }
}
