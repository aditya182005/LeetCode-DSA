class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < num.length(); i++)
        {
            char x = num.charAt(i);
            while(!stack.isEmpty() && stack.peek()>x && k>0)
            {
                stack.pop();
                k--;
            }
            stack.push(x);
        }
        while(k>0 && !stack.isEmpty())
        {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }
        while(result.length() > 0 && result.charAt(result.length() - 1) == '0')
        {
            result.deleteCharAt(result.length() - 1);
        }
        if(result.length() == 0) return "0";
        return result.reverse().toString();
    }
}