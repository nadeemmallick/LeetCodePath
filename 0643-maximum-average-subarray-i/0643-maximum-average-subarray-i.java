class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int l = 0;
        int r = k-1;

        int sum = 0;

        //first window
        for(int i = 0; i<k; i++){
            sum = sum+nums[i];
        }

        int max_sum = sum;

        //second window
        while(r < nums.length-1){
            sum -= nums[l];
            l++;
            r++;
            sum+= nums[r];

            max_sum = Math.max(sum,max_sum);
        }

        return (double) max_sum/k;

    }
}