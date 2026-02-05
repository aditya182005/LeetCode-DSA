class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int currentMax=0,currentMin=0;
        int maxSum=nums[0],minSum=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            currentMax=Math.max(currentMax+nums[i],nums[i]);
            maxSum=Math.max(maxSum,currentMax);

            currentMin=Math.min(currentMin+nums[i],nums[i]);
            minSum=Math.min(minSum,currentMin);

            totalSum+=nums[i];
        }


        if(maxSum<0) return maxSum;
        return Math.max(maxSum,totalSum-minSum);
    }
}