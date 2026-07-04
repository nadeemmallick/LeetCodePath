class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
         int start = 1;
         int max = -1;
         for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
         }
        int end = max;
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

        for (int i = 0; i<nums.length; i++) {

            operations += (nums[i] - 1) / mid;

            if (operations > maxOperations) {
                return false;
            }
        }

        return true;
        
    }
}