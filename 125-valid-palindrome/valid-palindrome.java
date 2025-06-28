class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();

		str = str.replaceAll("[^a-zA-Z0-9]","");
		int p1=0;
		int p2=str.length()-1;
        while(p1<=p2)
		{
			if(str.charAt(p1++)!=str.charAt(p2--))
			{
				return false;
			}
		}
		return true;
    }
}