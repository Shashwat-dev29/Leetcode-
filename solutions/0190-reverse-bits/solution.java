class Solution {
    public int reverseBits(int n) {
    //    return Integer.reverse(n);
   int result = 0;
    for (int i = 0; i < 32; i++) {
        // Shift result left to make room, then add the last bit of n
        result = (result << 1) | (n & 1);
        // Move to the next bit using unsigned right shift
        n >>>= 1; 
    }
    return result;
    }
}
