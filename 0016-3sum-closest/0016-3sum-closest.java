class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n -2; i++){
            for(int j = i+1; j < n-1 ; j++){
                for(int z = j+1 ; z < n; z++){

                int currentsum = nums[i] + nums[j] + nums[z];

                if(Math.abs(target-currentsum) < Math.abs(target - sum)){
                    sum = currentsum;
                }

                if(sum == target){
                    return sum;
                }
                }
            }
            
        }
        return sum;
        
    }
}