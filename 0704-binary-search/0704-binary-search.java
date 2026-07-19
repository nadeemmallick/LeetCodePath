class Solution {
    //     public int search(int[] nums, int target) {
    //         int n = nums.length;
    //         int start = 0;
    //         int end = n - 1;
    //         int mid = start + (end - start) / 2; // or we can take (start+end)/2

    //         while (start <= end) {

    //             if (nums[mid] == target) { // mid target ke equal hai
    //                 return mid;
    //             } 

    //             else if (target > nums[mid]) { //target bada hai mid se to right jao
    //                 start = mid + 1;
    //             } 

    //             else { // targer<mid hai to left jao
    //                 end = mid - 1;
    //             }

    //             mid = start + (end - start) / 2; // important humsa end mai mid ke value change kro

    //         }

    //         return -1;

    //     }

    // --------------------------------------------------------------------------------------------------------------------------------------------------------
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int ans = solve(nums, target, s, e);
        return ans;

    }

    public static int solve(int[] nums, int target, int s, int e) {
        //Base Case
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            e = mid - 1;
        } else {
            s = mid + 1;

        }

        //Recursive Case
        return solve(nums, target, s, e);
    }
}