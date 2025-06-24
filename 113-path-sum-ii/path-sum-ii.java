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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(root,targetSum,res,curr);
        return res;
    }
    private void dfs( TreeNode root, int targetSum,List<List<Integer>> res,List<Integer> curr )
    {
        if(root==null)return;
        curr.add(root.val);
        targetSum-=root.val;
        if(root.left==null&&root.right==null&&targetSum==0)
        {
            res.add(new ArrayList<>(curr));
        }
        else{
            dfs(root.left,targetSum,res,curr);
            dfs(root.right,targetSum,res,curr);
        }
        curr.remove(curr.size()-1);

        
    }
}