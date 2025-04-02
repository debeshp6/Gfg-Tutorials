class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        
        if(q < 2 || q > n * 2) {
            return 0;
        }
        
        if(q <= n + 1) {
            return q - 1;
        }
        
        else {
            return n - (q - n -1);
        }
    }
}
