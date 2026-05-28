class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> str=new HashSet<>();
        for(char c :word.toCharArray())
        {
            str.add(c);
        }
        int result=0;
        for(char c='a';c<='z';c++)
        {
            if(str.contains(c)&&str.contains((char)(c-'a'+'A')))
            {
                result++;
            }
        }
        return result;
    }
}