class Solution {
    public static boolean isPossible(int[] weights, int days, int mid){
        int daysCount = 1;
        int weightssum = 0;

        for(int i =0; i< weights.length; i++){
            if(weightssum + weights[i] <= mid){
                weightssum = weightssum + weights[i];
            }else{
                daysCount++;
                if(daysCount > days || weights[i] > mid){
                    return false;
                }else{
                    weightssum = 0;
                    weightssum = weightssum+weights[i];
                }
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        int sum = 0;
        for(int i =0; i < weights.length; i++){
            sum = sum + weights[i];

        }
        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isPossible(weights,days,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s =mid+1;
            }
        }
        return ans;
        
    }
}