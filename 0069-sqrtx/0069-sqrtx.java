class Solution {
    public int mySqrt(int x) {

        //Brute force approch->
        //         int ans = -1;
        //         if (x == 0) {
        //             return 0;
        //         }

        //         for (long i = 1; i * i <= x; i++) {
        //             ans = (int) i;
        //         }
        //         return ans;

        //opyimal approch

        int ans = -1;
        int s = 0;
        int e = x;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq > x) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
}