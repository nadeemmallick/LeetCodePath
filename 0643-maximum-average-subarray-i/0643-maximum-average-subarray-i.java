class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int right = 0;
        int left = k-1;

        int sum = 0;

        //first window
        for(int i = 0; i < k; i++){
            sum += nums[i];

        }

        int max_sum = sum;


        //slide the window one by one in sequent manner
        while(left < nums.length-1){

              sum = sum - nums[right]; //in window first we remove the first element

              right++;
              left++;

              sum = sum + nums[left]; // add next number which is added in the window

              max_sum = Math.max(sum,max_sum);

        }   

        return (double) max_sum/k;     
    }
}