class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        //   Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        int target = n;
        int count = 0;
        int[] candidates = {1,2,3,4,5,6,7,8,9};
    
        solve(candidates, target, index, output, ans,count,k);
        return ans;
        
    }
    public static void solve(int[] candidates, int target, int index, List<Integer> output, List<List<Integer>> ans,int count, int k) {
        //bs 1
        if(count > k){
            return;
        }
        if (target == 0 && count == k) {
            ans.add(new ArrayList<>(output));
            return;
        }
        if (index >= candidates.length) {
            return;
        }
        if (target < 0) {
            return;
        }

        //include and exclude
        //include
        output.add(candidates[index]);
        solve(candidates, target - candidates[index], index + 1, output, ans,count+1,k);

        //backtrack
        output.remove(output.size()-1);

        //duplicates
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        //exclude
        solve(candidates, target, index + 1, output, ans,count,k);
    }
}