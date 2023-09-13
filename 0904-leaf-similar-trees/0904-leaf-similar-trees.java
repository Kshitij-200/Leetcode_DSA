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
        if(root1 == null || root2 == null){
            return root1 == root2;
        }
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        getLeafNodesRecursive(root1, ans1);
        getLeafNodesRecursive(root2, ans2);

        return ans1.equals(ans2);
    }

    public void getLeafNodesRecursive(TreeNode node, List<Integer> leafNodes) {
        if (node == null) {
            return;
        }

        // If the current node is a leaf node (both left and right children are null),
        // add its value to the list.
        if (node.left == null && node.right == null) {
            leafNodes.add(node.val);
        }

        // Recursively traverse the left and right subtrees
        getLeafNodesRecursive(node.left, leafNodes);
        getLeafNodesRecursive(node.right, leafNodes);
    }
}