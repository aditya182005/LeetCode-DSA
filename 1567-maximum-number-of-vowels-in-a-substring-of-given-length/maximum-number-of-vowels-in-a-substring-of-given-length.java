class Solution {
    public int maxVowels(String s, int k) {
        int maximum=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i))) count++;
        }
        maximum=count;
        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k))) count--;
            maximum=Math.max(maximum,count);
        }
        return maximum;
    }
    private boolean isVowel(char ch)
    {
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
    }
}