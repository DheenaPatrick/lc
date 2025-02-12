class Solution {
public:
    int f(int i)
    {
        
        if(i<=1) return i;

        return f(i-1)+f(i-2);
    }
    int fib(int n) {
        
        int sum=f(n);
        return sum;
    }
};