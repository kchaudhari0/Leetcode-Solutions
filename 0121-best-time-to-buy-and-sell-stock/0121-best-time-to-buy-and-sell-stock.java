class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int purch=Integer.MAX_VALUE;
    for(int i=0 ;i<prices.length ; i++)
    {
         if(prices[i]<purch)
         {
             purch=prices[i];

         }
        else if(prices[i]-purch>profit)
        {
            profit=prices[i]-purch;
        }
        
        
    }
        
        return profit;
        
    }
}