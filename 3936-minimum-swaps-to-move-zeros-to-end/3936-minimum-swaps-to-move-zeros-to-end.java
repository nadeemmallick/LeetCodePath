class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int count = 0;

        while (i < j) {

            if (nums[i] != 0) {
                i++;
            } else if (nums[j] == 0) {
                j--;
            }

            else { //(nums[i] == 0 && nums[j] != =){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
                count++;
            }

        }
        return count;

    }
}