class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //This question is same as coin change ||
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(candidates,target,index,output,ans);
        return ans; 

        
    }
    public static void solve(int[] candidates, int target, int index,List<Integer> output,List<List<Integer>> ans){

        //base case 1
        if(target == 0){
            //answer mai output ko add krr lr gai
            ans.add(new ArrayList<>(output));
            return;
        }

        // base case 2
        if(index >= candidates.length){
            return;
        }

        // base case 3
        if(target < 0){
            return;
        }

        // include
        output.add(candidates[index]);
        solve(candidates , target - candidates[index],index,output,ans);

        //backtrack
        //jab ek brr include krr dia to output khali krna ho ga 
        output.remove(output.size()-1);

        //exclude
        solve(candidates,target,index+1,output,ans);
    }
}