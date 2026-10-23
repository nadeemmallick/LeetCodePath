class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();


        for(int nums : nums1){
            set.add(nums);
        }
        

        for(int nums : nums2){
            if(set.contains(nums)){
                result.add(nums);
                set.remove(nums);
            }
        }

       return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        
    }
}