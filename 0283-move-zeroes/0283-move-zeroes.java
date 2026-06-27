class Solution {
    public void moveZeroes(int[] nums) {
       

        int n = nums.length;
        int numzeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[numzeroIndex] = nums[i];
                numzeroIndex++;
            }
        }

        for (int i = numzeroIndex; i < n; i++) {
            nums[i] = 0;
        }
        
    }
}