class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int el = prices[0];
        int mProfit = 0;
        for(int i=1;i<prices.size();i++)
        {
            
            int diff = prices[i] - el;
            mProfit = std::max(mProfit,diff);
            if(diff < 0)el=prices[i];
        }
        return mProfit;
    }
};