class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=0;
        int chunk=0;
        int j=0;
        for(int i:arr)
        {
            if(i>max)max=i;
            if(j++==max)chunk++;
        }
        return chunk;
    }
}