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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> p1 = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();

        p1.add(p);
        q1.add(q);

        while(!p1.isEmpty() && !q1.isEmpty()){
            TreeNode nodeP = p1.poll();
            TreeNode nodeQ = q1.poll();

            if(nodeP == null && nodeQ == null) continue;
            if(nodeP != null && nodeQ != null && nodeP.val == nodeQ.val){
                p1.add(nodeP.left);
                p1.add(nodeP.right);
                q1.add(nodeQ.left);
                q1.add(nodeQ.right);
            }
            else {
                return false;
            }
        }

        return true;
    }
}
/*
q =  null
p = null
true

p = 1
q = null
false

p = 1, 2
q = null
false

*/