class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int x=k;
        while(set.contains(x))
        {
            x+=k;
        }
        return x;
    }
}