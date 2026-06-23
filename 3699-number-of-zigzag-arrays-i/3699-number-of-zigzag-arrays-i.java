class Solution {
    public int zigZagArrays(int n, int l, int r) {
        final int MOD = 1_000_000_007;

        r -= l;
        int[] dp = new int[r + 1];

        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            long pre = 0;

            if ((i & 1) == 1) {
                for (int v = 0; v <= r; v++) {
                    long temp = (pre + dp[v]) % MOD;
                    dp[v] = (int) pre;
                    pre = temp;
                }
            } else {
                for (int v = r; v >= 0; v--) {
                    long temp = (pre + dp[v]) % MOD;
                    dp[v] = (int) pre;
                    pre = temp;
                }
            }
        }

        long ans = 0;
        for (int x : dp) {
            ans = (ans + x) % MOD;
        }

        return (int) ((ans * 2) % MOD);
    }
        
    
}