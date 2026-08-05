class Solution {
    public int longestOnes(int[] nums, int k) {

        //Brute force
        // int maxlength = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int zerocount = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         if (nums[j] == 0) {
        //             zerocount++;
        //         }
        //         if (zerocount <= k) {
        //             int length = j - i + 1;
        //             maxlength = Math.max(maxlength, length);
        //         } else {
        //             break;
        //         }
        //     }
        // }
        // return maxlength;

        int l = 0;
        int r = 0;
        int zerocount = 0;
        int maxlength = 0;

        while (r < nums.length) {

            if (nums[r] == 0) {
                zerocount++;
            }

            while (zerocount > k) {
                if (nums[l] == 0) {
                    zerocount--;
                }
                l++;
            }

            if (zerocount <= k) {
                int length = r - l + 1;
                maxlength = Math.max(length, maxlength);
            }

            r++;
        }

        return maxlength;
    }

}