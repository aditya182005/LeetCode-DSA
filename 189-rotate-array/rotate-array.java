class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // If rotation is greater than array size
        k=k%n; 
        
        int i,j;

        // reverse last k elements
        for(i=n-k,j=n-1;i<j;i++,j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        // reverse first n-k elements
        for(i=0,j=n-k-1;i<j;i++,j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        // reverse the entire array
        for(i=0,j=n-1;i<j;i++,j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
    }
}