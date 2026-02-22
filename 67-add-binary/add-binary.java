import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        //for converting the binary(base 2) to big integer
        BigInteger n1=new BigInteger(a,2); 
        BigInteger n2=new BigInteger(b,2);
        return n1.add(n2).toString(2); 
        //adds and converts the no. to binary(.toString(radix/base=2))
    }
}