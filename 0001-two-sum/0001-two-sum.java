class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;

        // for(int i = 0; i<n-1; i++){

        //     for(int j= i+1 ; j<n; j++)
        //     if(nums[i] + nums[j] == target){
        //         int [] ans = {i ,j};
        //         return ans;

        //     }
        // }
        // int [ ] ans ={};
        // return ans;
        ////fggfgfg
          HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
        // int n = nums.length;
        // int Left = 0;
        // int Right = n-1;
        //  Arrays.sort(nums);

        // while(Left < Right){
        //     int sum = nums[Left] + nums[Right];

        //     if(sum == target){
        //          return new int[]{Left,Right};
        //     }else if(sum < target){
        //         Left++;
        //     }else{
        //         Right--;
        //     }
        // }
        // int [ ] ans ={};
        //  return ans;
    }
}