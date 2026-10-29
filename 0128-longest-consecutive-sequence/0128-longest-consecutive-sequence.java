class Solution {
    public int longestConsecutive(int[] nums) {

        //     int longest = 0;

        //     for(int i = 0; i< nums.length; i++){
        //         int current = nums[i];
        //         int length = 1;

        //         while(contains(nums,current+1)){
        //             current++;
        //             length++;
        //         }

        //         longest = Math.max(longest,length);
        //     }
        //     return longest;

        // }

        //   public boolean contains(int[] nums, int target) {
        //     for (int num : nums) {
        //         if (num == target) {
        //             return true;
        //         }
        //     }

        //     return false;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}