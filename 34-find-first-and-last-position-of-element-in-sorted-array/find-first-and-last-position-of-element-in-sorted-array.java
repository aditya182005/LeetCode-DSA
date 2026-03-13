class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min = -1;
        int max = -1;
        int count = 0;
        for(int i =0; i<nums.length;i++){ 
            if(nums[i] == target){
                count++;
                if(count == 1){
                    min = i;
                }
                 max = Math.max(max,i);
            }
        }
        return new int[]{min,max};
    }
}