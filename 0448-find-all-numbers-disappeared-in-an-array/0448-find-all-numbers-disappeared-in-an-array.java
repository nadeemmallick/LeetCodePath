class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
         int n = nums.length;

         for(int index = 0; index <n; index++){
            int value = Math.abs(nums[index]);
            int position = value-1;

            if(nums[position]>0){
                nums[position] = -nums[position];
            }
         }

         for(int i=0; i<n; i++){
            if(nums[i]>0){
            int value_at_this_index = i+1;
            ans.add(value_at_this_index );
         }
         }
         return ans;
        
    }
}