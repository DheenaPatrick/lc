class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count=0;
      int sum=0;
      int arrSum=0;
        int n = arr.length;
      for(int i=0;i<n;i++)
      {
        sum+=i;
        arrSum+=arr[i];
        if(arrSum==sum)count++;
      }
       
        return count;
    }
}