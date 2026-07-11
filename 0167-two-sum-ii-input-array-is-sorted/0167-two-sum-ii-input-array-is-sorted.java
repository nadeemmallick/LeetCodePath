class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int Left = 0;
        int Right = n-1;
        
        while(Left <= Right){
            int sum = numbers[Left] + numbers[Right];

            if(sum == target){
                 return new int[]{Left+1,Right+1};
            }else if(sum < target){
                Left++;
            }else{
                Right--;
            }
        }
        int [ ] ans ={};
         return ans;
        
    }
}