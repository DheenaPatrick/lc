class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int sum = 0;
        int chk = n*(n+1)/2;

        for(auto i:nums)
        {
            sum+=i;
        }
        int res = chk-sum;
        return res;

    }
};