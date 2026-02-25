class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int sorted[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(sorted);
        List<Integer> largest=new ArrayList<>();
        for(int i=sorted.length-k;i<sorted.length;i++)
        {
            largest.add(sorted[i]);
        }

        int result[]= new int[k];
        int index=0;
        for(int num:nums)
        {
            if(largest.contains(num))
            {
                result[index]=num;
                index++;
                largest.remove(Integer.valueOf(num));
                //this will remove the number from largest to avoid duplicates
                //Integer.valueOf is used because the number will be deleted
                //otherwise the number at the index value will be deleted
            }
        }
        return result;
    }
}