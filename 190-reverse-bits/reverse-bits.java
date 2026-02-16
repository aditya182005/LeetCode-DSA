class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;         // Shift result to the left to make room
            result |= (n & 1);    // Add the last bit of n to result
            n >>>= 1;             // Unsigned right shift n
        }
        return result;
    }
}