class Solution {
    public void getAllSequence(int[] nums, List<List<Integer>> ans, List<Integer> output, int index) {

        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;

        }

        // Include Current Element
        int currentvalue = nums[index];
        output.add(currentvalue);
        getAllSequence(nums, ans, output, index + 1);

        // Backtrack
        output.remove(output.size() - 1);

        // Skip Duplicates
        while (index + 1 < nums.length &&
                nums[index] == nums[index + 1]) {
            index++;
        }

        // Exclude Current Element
        getAllSequence(nums, ans, output, index + 1);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        getAllSequence(nums, ans, output, index);

        return ans;

    }
}