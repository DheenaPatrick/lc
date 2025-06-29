class Solution {
    StringBuilder sb = new StringBuilder();
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        validP(0,0,n);
        return res;
    }

    public void validP(int open,int close,int n)
    {
        if(open==close && close == n)
        {
            res.add(new String(sb.toString()));
            return;
        }

        if(open<n)
        {
            sb.append("(");
            validP(open+1,close,n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(open>close)
        {
            sb.append(")");
            validP(open,close+1,n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}