class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] charArray=s.toCharArray();
        int start=0,end=s.length()-1;
        while(start<end)
        {
            while(start<end && !vowels.contains(charArray[start])) start++;
            while(start<end && !vowels.contains(charArray[end])) end--;

            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;

            start++;
            end--;
        }
        return new String(charArray);
    }
}