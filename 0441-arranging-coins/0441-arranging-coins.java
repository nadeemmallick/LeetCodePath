class Solution {
    public int arrangeCoins(int n) {
        // int row = 1;

        // while (n >= row) {
        //     n = n - row;
        //     row++;
        // }

        // return row - 1;

        long s = 0;
        long e = n;
        long ans = 0;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            }

            if (coins < n) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return (int) ans;
    }

}
