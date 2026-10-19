class Solution {
    public int largestAltitude(int[] gain) {
        int prefixSum=0;
        int maximum = 0;
        for(int  i = 0; i < gain.length; i++)
        {
            prefixSum += gain[i];
            maximum = Math.max(prefixSum , maximum);
        }
        return maximum;
    }
}