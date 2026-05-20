class Solution {
    public int mySqrt(int x) {
        
        int res = 0;

        if(x == 0) {
            return res;
        }

        for(long i = 1; i *i <= x; i++) {
            res = (int)i;
        }
        return res;
    }
}