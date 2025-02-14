class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n = nums.size();
        int c=0;
        int max=0;
        for(auto i:nums)
        {
            if(i==0)
            {
                c=0;
                continue;
            }
            c++;
            max = std::max(c,max);
        }
        return max;
    }
};