class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = k-1;

        int sum = 0;

        //first Window
        for(int i = 0; i <k; i++){
            sum += nums[i];
        }

        int max_sum = sum;

        //sliding window
        while(r< nums.length-1){
            sum -= nums[l];
            l++;
            r++;
            sum+=nums[r];

            max_sum = Math.max(max_sum , sum);
        }

        return (double) max_sum/k;
        
    }
}