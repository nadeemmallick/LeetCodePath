class Solution {
    public int singleNumber(int[] nums) {
        // //Brute force approch
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         return nums[i];
        //     }
        // }
        // return -1;

        //optimal approch

        int n = nums.length;

        int result = 0;

        for(int i = 0; i < n; i++){
            result = result^nums[i];
        }

        return result;
    }
}