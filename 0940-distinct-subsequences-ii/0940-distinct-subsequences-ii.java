class Solution {
    public int distinctSubseqII(String s) {
        
        int MOD = 1000000007;

        int[] dp = new int[26];

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';

            int total = 1;

            for (int i = 0; i < 26; i++) {
                total = (total + dp[i]) % MOD;
            }

            dp[index] = total;
        }

        int ans = 0;

        for (int count : dp) {
            ans = (ans + count) % MOD;
        }

        return ans;
    }
}