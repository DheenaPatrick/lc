import java.util.Arrays; // Importing the Arrays class for sorting. ⚙️

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Our main function that takes an array of numbers (nums) and a target value.
        // It finds a triplet in the array whose sum is closest to the target
        // and returns that sum. \U0001f3af

        Arrays.sort(nums); // Sort the array to make it easier to use the two-pointer approach. \U0001f9f9

        int closestSum = nums[0] + nums[1] + nums[nums.length - 1];
        // Initialize closestSum with the sum of the first three numbers in the
        // sorted array. It's our initial guess for the closest sum. \U0001f914

        int minDiff = Math.abs(closestSum - target);
        // Initialize minDiff with the absolute difference between closestSum and
        // target. This will keep track of the smallest difference we've found. \U0001f4cf

        for (int i = 0; i < nums.length - 2; i++) {
            // This is the outer loop that iterates through the array to pick the first
            // number of the triplet. We stop at `nums.length - 2` because we need at
            // least three numbers for a triplet. \U0001f6b6‍♀️

            int left = i + 1; // Left pointer starts from the next element. \U0001f448
            int right = nums.length - 1; // Right pointer starts from the end of the array. \U0001f449

            while (left < right) {
                // The inner loop uses the two-pointer technique. We try to find two numbers
                // that, along with `nums[i]`, give us a sum closest to the target. \U0001f504

                int sum = nums[i] + nums[left] + nums[right]; // Calculate the current sum. ➕
                int diff = Math.abs(sum - target); // Calculate the absolute difference between sum and target. ➖

                if (diff < minDiff) {
                    // If the current difference is smaller than the minimum difference we've
                    // seen so far, update minDiff and closestSum. This means we've found a
                    // sum that's even closer to the target! \U0001f389
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    // If the sum is less than the target, we need a larger sum. So, move
                    // the left pointer to the right to consider a larger number. ➡️
                    left++;
                } else {
                    // If the sum is greater than or equal to the target, we need a smaller
                    // sum. So, move the right pointer to the left to consider a smaller number. ⬅️
                    right--;
                }
            }
        }

        return closestSum; // Return the closest sum we've found. \U0001f381
    }
}