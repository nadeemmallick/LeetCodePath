class Solution {
    public static boolean isValid(int[] nums, int k, int mid) {
        int Kcount = 1;
        int numberSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (numberSum + nums[i] <= mid) {
                numberSum = numberSum + nums[i];
            } else {
                Kcount++;
                if (Kcount > k || nums[i] > mid) {
                    return false;
                } else {
                    numberSum = 0;
                    numberSum = numberSum + nums[i];
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        if(nums.length < k){
            return -1;
        }
        int n = nums.length;
        int s = 0;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += nums[i];
        }
        int e = sum;
        int ans = -1;

        while(s <= e){
            int mid = s+(e-s)/2;
            if(isValid(nums,k,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;        
    }
}