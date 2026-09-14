class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n; // k ke small value nikal le 

        reverse(nums, 0, n - 1); // phle hum pure array ko reverse krr dete hai
        reverse(nums, 0, k - 1);//uske badd  array ke first half ko rotate kare gai 
        reverse(nums, k, n - 1);//then baki bacche hua part ko rotate krr de gai

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}