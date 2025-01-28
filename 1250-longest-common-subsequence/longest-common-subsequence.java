class Solution {
    public static int lcs(int i, int j, String text1, String text2, int[][] memo) {
        // Base case: if either i or j is 0, then the lcs is 0.
        if (i == 0 || j == 0)
            return 0;
        if (memo[i][j] != -1)
            return memo[i][j];
        if (text1.charAt(i - 1) == text2.charAt(j - 1))
            // We matched a char.
            return memo[i][j] = lcs(i - 1, j - 1, text1, text2, memo) + 1;
        // Else look at the lcs by removing this char from either string.
        return memo[i][j] = Math.max(lcs(i - 1, j, text1, text2, memo), lcs(i, j - 1, text1, text2, memo));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] memo = new int[n + 1][m + 1];
        for (var row : memo) {
            Arrays.fill(row, -1);
        }
        return lcs(n, m, text1, text2, memo);
    }
}