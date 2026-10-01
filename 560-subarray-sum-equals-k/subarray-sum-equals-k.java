class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int num:nums)
        {
            prefixSum+=num;
            if(map.containsKey(prefixSum-k))
            {
                count+=map.get(prefixSum-k);
            }
            if(map.containsKey(prefixSum))
            {
                map.put(prefixSum,map.get(prefixSum)+1);
            }
            else
            {
                map.put(prefixSum,1);
            }
        }
        return count;
    }
}