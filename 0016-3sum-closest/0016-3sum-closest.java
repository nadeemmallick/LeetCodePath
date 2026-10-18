class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int n = nums.length;
        // int sum = nums[0] + nums[1] + nums[2];
        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i + 1; j < n - 1; j++) {
        //         for (int z = j + 1; z < n; z++) {

        //             int currentsum = nums[i] + nums[j] + nums[z];

        //             if (Math.abs(target - currentsum) < Math.abs(target - sum)) {
        //                 sum = currentsum;
        //             }

        //             if (sum == target) {
        //                 return sum;
        //             }
        //         }
        //     }

        // }
        // return sum;

        Arrays.sort(nums);
        int n = nums.length;
        int closestsum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - currentSum) < Math.abs(target - closestsum)) {
                    closestsum = currentSum;
                }

                if (currentSum == target) {
                    return currentSum;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestsum;

    }
}