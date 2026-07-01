class Solution {
    public int[] sortedSquares(int[] nums) {

    int n = nums.length;
    int[] ans = new int[n];

    // Step 1: Square every element
    for (int i = 0; i < n; i++) {
        ans[i] = nums[i] * nums[i];
    }

    // Step 2: Bubble Sort
    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - i - 1; j++) {

            if (ans[j] > ans[j + 1]) {

                int temp = ans[j];
                ans[j] = ans[j + 1];
                ans[j + 1] = temp;
            }
        }
    }

    return ans;
}
 }