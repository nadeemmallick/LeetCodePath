class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;
        

        // for(int i = 0; i< n; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i] == nums[j]){
        //             return nums[i];
        //         }
        //     }
           
        // }
        // return -1;
        //  Arrays.sort(nums);

        // for (int i = 0; i < nums.length - 1; i++) {

        //     if (nums[i] == nums[i + 1]) {
        //         return nums[i];
        //     }
        // }

        // return -1;
        
        // Phase 1: Find the meeting point
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the duplicate (cycle entrance)
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}