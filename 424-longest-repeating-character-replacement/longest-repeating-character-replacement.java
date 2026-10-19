class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxCount = 0;
        int result = 0;
        int[] count = new int[26];
        for(int right = 0; right < s.length(); right++)
        {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount , count[s.charAt(right) - 'A']);

            while(right - left + 1 - maxCount > k)
            {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result , right - left  + 1);
        }
        return result;
    }
}