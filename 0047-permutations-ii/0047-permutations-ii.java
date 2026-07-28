class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solve(nums, ans, output, used);
        return ans;

    }

    public static void solve(int[] nums, List<List<Integer>> ans, List<Integer> output, boolean[] used) {
        //bc
        if (output.size() == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            output.add(nums[i]);

            solve(nums, ans,output, used);

            output.remove(output.size() - 1);
            used[i] = false;
        }
    }
}