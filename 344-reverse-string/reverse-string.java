
class Solution {
    public void reverseString(char[] s) {
        int p2 = s.length-1;
        int p1=0;
        

        while(p1<p2)
        {
            char temp = s[p1];
            s[p1++] = s[p2];
            s[p2--]=temp;
        }
    }
    
}