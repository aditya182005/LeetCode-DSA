class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.indexOf(s,1) != s.length();
    }
}