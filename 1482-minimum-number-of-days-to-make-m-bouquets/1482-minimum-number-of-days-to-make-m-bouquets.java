class Solution {
    public static boolean isvalid(int[] bloomDay, int m, int k, int mid){
        int count = 0;      // consecutive bloomed flowers
        int bouquets = 0;   // bouquets made

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {
                count++;
            } else {
                count = 0;   // chain break
            }

            if (count == k) {
                bouquets++;
                count = 0;   // used these k flowers
            }
        }

        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int s = 0;
        int max = -1;
        for(int i = 0; i<n; i++){
            if(bloomDay[i] >= max){
                max = bloomDay[i];
            }
        }
        int e = max;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;

            if (isvalid(bloomDay,m,k,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
        
    }
}