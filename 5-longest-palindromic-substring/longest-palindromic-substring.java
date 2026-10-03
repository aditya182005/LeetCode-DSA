class Solution {
    public int isPalindrome(String s,int i,int j)
    {
        int length=0;
        while(i>=0 && j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                length=j-i+1;
                i--;
                j++;
            }
            else return length;
        }
        return length;
    }
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            int odd=isPalindrome(s,i,i);
            int even=isPalindrome(s,i,i+1);
            int maximumLength=Math.max(odd,even);

            if(maximumLength>end-start+1)
            {
                start=i-(maximumLength-1)/2;
                end=i+maximumLength/2;
            }
        }
        return s.substring(start,end+1);
    }
}