class Solution {
    public String decodeString(String s) {
        Stack<Integer> count=new Stack<>();
        Stack<StringBuilder> str=new Stack<>();
        StringBuilder currStr=new StringBuilder();
        int num=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='[')
            {
                count.push(num);
                str.push(currStr);
                num=0;
                currStr=new StringBuilder();
            }
            else if(ch==']')
            {
                int repeat=count.pop();
                StringBuilder prevStr=str.pop();
                for(int i=0;i<repeat;i++)
                {
                    prevStr.append(currStr);
                }
                currStr=prevStr;
            }
            else{
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
}