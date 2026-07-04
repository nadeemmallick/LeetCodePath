class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
         int start = 1;
        int end = 0;

        for (int num : nums) {
            end = Math.max(end, num);
        }

        int ans = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValid(nums, maxOperations, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public boolean isValid(int[] nums, int maxOperations, int mid) {

        int operations = 0;

        for (int num : nums) {

            operations += (num - 1) / mid;

            if (operations > maxOperations) {
                return false;
            }
        }

        return true;
        
    }
}