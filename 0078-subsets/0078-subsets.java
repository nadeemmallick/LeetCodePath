class Solution {
    public void getAllSubsequence(int[] nums, List<List<Integer>> ans, List<Integer> output, int index) {

        //base case
         if (index == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // Include Current Element
        output.add(nums[index]);
        getAllSubsequence(nums, ans, output, index + 1);

        // Backtrack
        output.remove(output.size() - 1);

        // Exclude Current Element
        getAllSubsequence(nums, ans, output, index + 1);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        getAllSubsequence(nums, ans, output, index);
        // Collections.sort(ans);
        return ans;

    }
}