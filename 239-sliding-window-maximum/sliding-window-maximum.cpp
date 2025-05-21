class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int> dq;       
        vector<int> ans;
        int n = nums.size();

        for (int i = 0; i < n; ++i) {
            // 1) remove indices out of this window
            if (!dq.empty() && dq.front() == i - k)
                dq.pop_front();

            // 2) remove all smaller elements than nums[i],
            //    since they cannot be the max if nums[i] is in window
            while (!dq.empty() && nums[dq.back()] < nums[i])
                dq.pop_back();

            // 3) add current index
            dq.push_back(i);

            // 4) record the max for windows ending at i
            if (i >= k - 1)
                ans.push_back(nums[dq.front()]);
        }

        return ans;
    }
};