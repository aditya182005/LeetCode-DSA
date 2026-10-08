class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen=new HashSet<>();
        Set<String> repeated=new HashSet<>();
        for(int i=0;i+10<=s.length();i++)
        {
            String subString =s.substring(i,i+10);
            if(!seen.add(subString))
            {
                repeated.add(subString);
            }
        }
        return new ArrayList(repeated);
    }
}