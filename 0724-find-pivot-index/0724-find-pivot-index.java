class Solution {
    public int pivotIndex(int[] nums) {
        // int n = nums.length;
        // int leftsum[] = new int[n];
        // int rightsum[] = new int[n];

        // //leftsum
        // leftsum[0] = nums[0];
        // for(int i = 1 ; i<n ; i++){
        //     leftsum[i] = leftsum[i-1]+nums[i];
        // }

        // //rightsum
        // rightsum[n-1] = nums[n-1];
        // for(int i = n-2; i>=0; i--){
        //     rightsum[i] = rightsum[i+1] + nums[i];
        // }

        // for(int i = 0; i<n; i++){
        //     if(leftsum[i]==rightsum[i]){
        //         return i;
        //     }
        // }
        // return -1;

        //BRUTE FORCE

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int leftsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += nums[j];
            }

            int rightsum = 0;
            for (int k = i + 1; k < n; k++) {
                rightsum += nums[k];
            }

            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;

    }
}