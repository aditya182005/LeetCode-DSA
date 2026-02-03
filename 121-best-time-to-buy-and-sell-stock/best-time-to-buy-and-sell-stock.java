class Solution {
    public int maxProfit(int[] prices) {
        int maximum=0;
        int minimum=prices[0];

        for(int i=0;i<prices.length;i++)
        {
            minimum=Math.min(minimum,prices[i]);

            maximum=Math.max(maximum,prices[i]-minimum);
        }
        return maximum;
    }
}