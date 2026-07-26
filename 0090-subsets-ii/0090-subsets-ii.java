class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(nums, index, output, ans);
        return ans;
    }
    

    public static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currtvalue = nums[index];

        output.add(currtvalue);
        solve(nums, index + 1, output, ans);

        output.remove(output.size() - 1);

        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }

        solve(nums, index + 1, output, ans);
    }
}
    // public void getAllSequence(int[] nums, List<List<Integer>> ans, List<Integer> output, int index) {

    //     if (index >= nums.length) {
    //         ans.add(new ArrayList<>(output));
    //         return;

    //     }

    //     // Include Current Element
    //     int currentvalue = nums[index];
    //     output.add(currentvalue);
    //     getAllSequence(nums, ans, output, index + 1);

    //     // Backtrack
    //     output.remove(output.size() - 1);

    //     // Skip Duplicates
    //     while (index + 1 < nums.length &&
    //             nums[index] == nums[index + 1]) {
    //         index++;
    //     }

    //     // Exclude Current Element
    //     getAllSequence(nums, ans, output, index + 1);

    // }

    // public List<List<Integer>> subsetsWithDup(int[] nums) {
    //     Arrays.sort(nums); 
    //     List<List<Integer>> ans = new ArrayList<>();
    //     List<Integer> output = new ArrayList<>();
    //     int index = 0;

    //     getAllSequence(nums, ans, output, index);

    //     return ans;


