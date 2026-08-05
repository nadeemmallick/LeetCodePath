class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength = 0;
        for (int i = 0; i < nums.length; i++) {
            int zerocount = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zerocount++;
                }
                if (zerocount <= k) {
                    int length = j - i + 1;
                    maxlength = Math.max(maxlength, length);
                } else {
                    break;
                }
            }
        }
        return maxlength;

    }
}