class Solution {
    public boolean isvalid(int[] nums, int target, int mid) {
        if (nums[mid] >= target) {
            return true;
        } else {
            return false;
        }
    }

    public int searchInsert(int[] nums, int target) {

        // for(int i =0; i< nums.length ; i++){
        //     if(nums[i] >= target){
        //         return i;
        //     }
        // }
        // return nums.length;

        int n = nums.length;
        int s = 0;

        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isvalid(nums, target, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;

    }
}