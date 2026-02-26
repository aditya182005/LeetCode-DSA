class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int frequency[] = new int[(nums.length)+1];

        for(int i=0;i<nums.length;i++)
        {
            frequency[nums[i]]++;
        }
        
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=1;i<=nums.length;i++)
        {
            if(frequency[i] == 0) result.add(i);
        }

        return result;
    }
}