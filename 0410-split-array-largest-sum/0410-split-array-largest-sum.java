class Solution {

    public static boolean Isvalid(int[] nums, int k, int mid){
        int KCount = 1;
        int numbersum = 0;

        for(int i = 0; i<nums.length; i++){
            if(numbersum + nums[i] <= mid){
                numbersum = numbersum + nums[i];
            }else{
                KCount++;
                if(KCount > k || nums[i] > mid){
                    return false;
                }else{
                    numbersum = 0;
                    numbersum = numbersum+nums[i];
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
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum+nums[i];
        }
        int s = 0;
        int end = sum;
        int ans =-1;

        while(s<=end){
            int mid = s+(end-s)/2;

            if(Isvalid(nums,k,mid)){
                ans = mid;
                end = mid-1;
            }else{
                s= mid+1;
            }
        }
        return ans;
        
    }
}