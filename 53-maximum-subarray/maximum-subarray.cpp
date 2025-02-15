class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum =0;
        int max = INT_MIN;

        for(auto i:nums)
        {
            sum+=i;
            max = std::max(max,sum);
            if(sum<0)
            {
                sum=0;
            }
            
        }
        return max;
    }
};