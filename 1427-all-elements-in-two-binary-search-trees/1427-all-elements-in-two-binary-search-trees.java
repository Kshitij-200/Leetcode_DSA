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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        if(root1 == null && root2 == null){
            return ans;
        }
        helper(root1,ans);
        helper(root2,ans1);
        ans.addAll(ans1);
        Collections.sort(ans);
        return ans;
    }

    public void helper(TreeNode root, List<Integer> ds){
        if(root == null){
            return;
        }

        helper(root.left,ds);
        ds.add(root.val);
        helper(root.right,ds);
    }
}