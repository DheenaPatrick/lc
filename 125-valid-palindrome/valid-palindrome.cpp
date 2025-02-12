class Solution {
public:
    bool func(string &s,int i,int j)
    {
        if(i>=j)
        {
            cout<<i<<" "<<j;
            return true;
        }
        if(s[i]!=s[j])return false;
        cout<<i<<" "<<j;
        return func(s,++i,--j);
        
    }
    bool isPalindrome(string s) {
        transform(s.begin(),s.end(),s.begin(),::tolower);
        
       

size_t i = 0;
size_t len = s.length();
while(i < len){
    if (!isalnum(s[i]) || s[i] == ' '){
        s.erase(i,1);
        len--;
    }else
        i++;
}
        cout<<s;
        bool res = func(s,0,s.length()-1);
        return res;
    }
};