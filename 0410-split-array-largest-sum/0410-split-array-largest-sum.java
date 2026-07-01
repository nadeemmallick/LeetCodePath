class Solution {
    public static boolean isValid(int[] nums, int k, int mid) {
        int Kcount = 1; // we take first count in start
        int numberSum = 0; //and take the number sum

        for (int i = 0; i < nums.length; i++) {
            //in first if condition we check is the numbersum + nums[i] is less then mid if yes then we add the num i in number sum
            if (numberSum + nums[i] <= mid) {
                numberSum = numberSum + nums[i];
            } else {
                //if the first condition is not fullfill then we come in else loop to return true or sum of next student
                Kcount++;
                if (Kcount > k || nums[i] > mid) { // return false if Kcount is greater than the k or nums i greater than mid
                    return false;
                } else { // if not we simply perform else numbersum 
                    numberSum = 0;
                    numberSum = numberSum + nums[i];
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {

        // solve when the nums length is greater than the give k value
        if (nums.length < k) {
            return -1;
        }

        int n = nums.length;
        int s = 0;
        int sum = 0; // we take sum because the answer come between 0 -> numsSum
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int e = sum;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            //we make a proper function to handle valid operation and we pass nums,value of k and mid 
            if (isValid(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}