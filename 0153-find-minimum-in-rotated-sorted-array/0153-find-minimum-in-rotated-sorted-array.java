class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = nums[0];

        if (nums[s] <= nums[e]) {
            return nums[0];
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= nums[n - 1]) {
                ans = nums[mid];
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}