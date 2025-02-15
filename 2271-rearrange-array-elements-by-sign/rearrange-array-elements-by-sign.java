class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;
        int n = 1;
        int k = nums.length;
        int arr[] = new int[k];
        for(int i=0;i<k;i++)
        {
            if(nums[i]>0)
            {
                arr[p] = nums[i];
                p+=2;
            }
            else
            {
                arr[n] = nums[i];
                n+=2;

            }
        }
        return arr;
    }
}