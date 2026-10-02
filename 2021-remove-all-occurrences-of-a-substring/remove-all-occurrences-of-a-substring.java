class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result=new StringBuilder(s);
        while(result.toString().contains(part))
        {
            int index=result.indexOf(part);
            result.delete(index,index+part.length());
        }
        return result.toString();
    }
}