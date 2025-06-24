/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { this.val = val; }
 * }
 */
// TC and SC: O(N)
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0L, 1); // 0 can be reached in 1 way without going to any nodes.
        return dfs(root, 0L, targetSum, prefixSumMap);
    }

    private int dfs(TreeNode root, long currSum, int targetSum, Map<Long, Integer> prefixSumMap) {
        if (root == null)
            return 0; // Base case

        currSum += root.val; // Update currPrefixSum.
        int paths = prefixSumMap.getOrDefault(currSum - targetSum, 0); // No of paths with the sum.

        // Update map with currPrefixSum.
        prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);

        // Explore subtrees
        paths += dfs(root.left, currSum, targetSum, prefixSumMap);
        paths += dfs(root.right, currSum, targetSum, prefixSumMap);

        // Backtrack
        prefixSumMap.put(currSum, prefixSumMap.get(currSum) - 1);

        return paths;
    }

}

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