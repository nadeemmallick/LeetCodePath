class Solution {
    public static boolean isValid (int[] piles, int  h, int minSpeed){
        long hours = 0 ;

        for(int i = 0 ; i<piles.length; i++){
            hours = hours + (piles[i]+minSpeed-1)/minSpeed;
            
        }
        if(hours <= h ){
            return true;
        }else{
            return false;
        }
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int start = 1;
        int maxBananaPiles = -1;
        for (int i = 0; i < n; i++) {
            if (piles[i] >= maxBananaPiles) {
                maxBananaPiles = piles[i];
            }
        }
        int end = maxBananaPiles;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(piles,h,mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}