class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();


        for(int nums : nums1){
            set.add(nums);
        }
        

        for(int nums : nums2){
            if(set.contains(nums)){
                result.add(nums);
                
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for(int num : result){
            ans[i] = num;
            i++;
        }

        return ans;
        
        
    }
}