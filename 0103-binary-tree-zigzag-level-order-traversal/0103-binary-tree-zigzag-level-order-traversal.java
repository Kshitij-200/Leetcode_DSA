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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        boolean reverse = false;
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> ds = new ArrayList<>();
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++){
                if(!reverse){
                    TreeNode curr = q.pollFirst();
                    ds.add(curr.val);
                    if(curr.left != null){
                        q.addLast(curr.left);
                    }
                    if(curr.right != null){
                        q.addLast(curr.right);
                    }
                }
                if(reverse){
                    TreeNode curr = q.pollLast();
                    ds.add(curr.val);
                    if(curr.right != null){
                        q.addFirst(curr.right);
                    }
                    if(curr.left != null){
                        q.addFirst(curr.left);
                    }
                }
            }
            reverse = !reverse;
            ans.add(ds);
        }
        return ans;
    }
}