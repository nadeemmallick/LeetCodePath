class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int left = 0;
        long sum = 0;
        long maxsum = 0;

        for (int right = 0; right < nums.length; right++) {

            // Remove duplicate elements
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            sum += nums[right];

            // Maintain window size k
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Check valid window
            if (right - left + 1 == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;

        // long maxsum = 0;

        // for (int i = 0; i <= nums.length - k; i++) {

        //     long sum = 0;
        //     HashSet<Integer> set = new HashSet<>();
        //     boolean valid = true;

        //     for (int j = i; j < i + k; j++) {

        //         if (set.contains(nums[j])) {
        //             valid = false;
        //             break;
        //         }
        //         set.add(nums[j]);
        //         sum += nums[j];
        //     }

        //     if (valid) {
        //         maxsum = Math.max(sum, maxsum);
        //     }
        // }

        // return maxsum;

    }
}