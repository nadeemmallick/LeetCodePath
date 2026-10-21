class Solution {
    public int missingNumber(int[] nums) {

        // int n = nums.length;

        // for(int i = 0; i <=n; i++){

        //     boolean found = false;

        //     for(int j = 0; j < n; j++){

        //         if(nums[j] == i){
        //             found = true;
        //             break;
        //         }
        //     }

        //     if(!found){
        //         return i;
        //     }
        // }
        // return -1;

        // best

        int n = nums.length;

        int expectedsum = n*(n+1)/2;
        int actualsum = 0;

        for(int i = 0; i <n ; i++){
            actualsum = actualsum+nums[i];
        }

        return expectedsum - actualsum;
        
    }
}