class Solution {
public:
    void nextPermutation(vector<int>& arr) {
        int index = -1;
        int n = arr.size();
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            std::reverse(arr.begin(),arr.end());
            return;
        } 
        for(int i=n-1;i>index;i--)
        {
            if(arr[i]>arr[index])
            {
                std::swap(arr[i],arr[index]);
                break;
            }
        }
        std::reverse(arr.begin()+index+1,arr.end());

    }
};