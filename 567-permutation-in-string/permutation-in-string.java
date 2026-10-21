class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];
        for(char c : s1.toCharArray())
        {
            s1Frequency[c - 'a']++;
        }
        for(int i = 0; i < s2.length(); i++)
        {
            s2Frequency[s2.charAt(i) - 'a']++;
            if(i >= s1.length())
            {
                s2Frequency[s2.charAt(i - s1.length()) - 'a']--;
            }
            if(Arrays.equals(s1Frequency , s2Frequency)) return true;
        }
        return false;
    }
}