class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int el = nums[0];
        int count =1;

        for(int i=1;i<nums.size();i++)
        {
            if(count==0)
            {
                el = nums[i];
            }
            if(el==nums[i])count++;
            else{
                count--;
            }
            
        }
        return el;
        
        
    }
};