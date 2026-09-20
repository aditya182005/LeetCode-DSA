class Solution {
    public int compress(char[] chars) {
        int n =chars.length;
        int index=0;
        int i=0;
        while(i<n)
        {
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch)
            {
                i++;
                count++;
            }
            chars[index++]=ch;
            if(count>1)
            {
                for(char digit:Integer.toString(count).toCharArray())
                {
                    chars[index++]=digit;
                }
            }
        }
        return index;
    }
}