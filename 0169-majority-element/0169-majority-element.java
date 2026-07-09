class Solution {
    public int majorityElement(int[] nums) {
        // int mode = nums[0];
        // int maxfreq = 0;

        // for(int i = 0; i< nums.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             count ++;
        //         }
        //     }
        //     if(count > maxfreq){
        //         maxfreq = count;
        //         mode = nums[i];
        //     }
        // }
        // return mode;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = nums[0];
        int maxFreq = 0;

        for (int key : map.keySet()) {

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}