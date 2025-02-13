class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        int res = arr.size();
        int n=res;
        int j=1;
        for(int i=0;i<n-1;i++)
        {
            while(i<n-1&&arr[i]==arr[i+1]){
                i++;
                res--;
            }
            if(i<n-1)arr[j++]=arr[i+1];
        }
        return res;
    }
};