class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0)            //loop continues until num becomes zero
        {
            sum+=(num%10);
            num/=10;
        }
        if(sum<10)
        return sum;
        else
        return addDigits(sum);
        
    }
}