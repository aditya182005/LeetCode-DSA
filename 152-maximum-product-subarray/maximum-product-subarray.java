class Solution {
    public int maxProduct(int[] nums) {
        long currentMax=nums[0];
        long currentMin=nums[0];
        long maximumProduct=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            long tempMax=currentMax;
            long tempMin=currentMin;
            currentMin=Math.min(nums[i],Math.min(nums[i]*tempMin,nums[i]*tempMax));
            currentMax=Math.max(nums[i],Math.max(nums[i]*tempMin,nums[i]*tempMax));
            
            maximumProduct=Math.max(maximumProduct,currentMax);
        }
        
        return (int) maximumProduct;
    }
}