class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int n = nums.length;
        // int maxsum =  Integer.MIN_VALUE;

        // for(int start = 0; start < n; start++){
        //     int sum = 0;
        //     for(int len = 0; len < n ; len++){
        //         int index = (start+len) %n;
        //         sum += nums[index];
        //         maxsum = Math.max(sum,maxsum);
        //     }
        // }
        // return maxsum;

        int totalsum = 0;

        int maxsum = nums[0];
        int currmax = 0;

        int minsum = nums[0];
        int currmin = 0;

        for (int i = 0; i < n; i++) {

            totalsum += nums[i];

            //max sum
            currmax = Math.max(nums[i], currmax + nums[i]);
            maxsum = Math.max(currmax, maxsum);

            //min sum
            currmin = Math.min(nums[i], currmin + nums[i]);
            minsum = Math.min(currmin, minsum);

        }
        // Edge Case: All numbers are negative
        if (maxsum < 0) {
            return maxsum;
        }
        // Maximum of normal and circular subarray
        return Math.max(maxsum, totalsum - minsum);

    }
}