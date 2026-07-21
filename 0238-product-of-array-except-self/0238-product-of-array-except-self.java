class Solution {
    public int[] productExceptSelf(int[] nums) {

        // //Brute froce
        // int n = nums.length;
        // int[] ans = new int[n];

        // for (int i = 0; i < n; i++) {
        //     int product = 1;

        //     for (int j = 0; j < n; j++) {
        //         if (i != j) {
        //             product *= nums[j];
        //         }
        //     }
        //     ans[i] = product;
        // }
        // return ans;

        //Optimal 

        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        //left product array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        //right product
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }

        //multiplication
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;

    }
}