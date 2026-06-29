class Solution {
    // first we find pivot element
   static  int pivotElement(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] <= nums[n-1]){
                e = mid-1;
            }else
            {
                // arr[mid] > arr[n-1]
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }

    static int binary_search(int[] nums, int s, int e, int target) {
        int n = nums.length;
        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == target) {
                return mid;

            } else if (nums[mid] < target) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivotIndex = pivotElement(nums);
        int n = nums.length;

        if (pivotIndex == -1) {
            int ans = binary_search(nums, 0, n - 1, target);
            return ans;
        } else {

            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if (target >= nums[startArray1] && target <= nums[endArray1]) {
                int ans = binary_search(nums, startArray1, endArray1, target);
                return ans;

            }

            int startArray2 = pivotIndex + 1;
            int endArray2 = n - 1;

            if (target >= nums[startArray2] && target <= nums[endArray2]) {
                int ans = binary_search(nums, startArray2, endArray2, target);
                return ans;

            }

        }
        return -1;
    }
}