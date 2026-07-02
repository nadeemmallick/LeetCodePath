class Solution {
    public void moveZeroes(int[] nums) {
       

        int n = nums.length;
        int nonzeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonzeroIndex] = nums[i];
                nonzeroIndex++;
            }
        }

        for (int i = nonzeroIndex; i < n; i++) {
            nums[i] = 0;
        }
        
    }
}