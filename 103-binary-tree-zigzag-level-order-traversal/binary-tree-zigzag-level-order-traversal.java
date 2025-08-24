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
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)return result;

        Queue<TreeNode> qNode = new LinkedList<>();
        qNode.add(root);
        boolean isLR = true;
        while(!qNode.isEmpty())
        {
            int size = qNode.size();
            List<Integer> row = new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode temp = qNode.remove();
                row.add(temp.val);

                if(temp.left!=null)qNode.add(temp.left);
                if(temp.right!=null)qNode.add(temp.right);


                
            }
            if(isLR)result.add(row);
            else {
                Collections.reverse(row);
                result.add(row);
            }
            isLR = !isLR;
        }
        return result;
    }
}