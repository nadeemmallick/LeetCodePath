class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;

        int totalwater = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalwater += leftMax - height[left];
                }
                left++;
            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalwater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalwater;

        // int n = height.length;
        // int total_water = 0;

        // for(int i =0; i < n; i++){
        //     int left_max = 0;
        //     int right_max = 0;

        //     //leftmax
        //     for(int j = 0; j<=i; j++){
        //         left_max = Math.max(left_max,height[j]);
        //     }

        //     //rightmax
        //     for(int j = i; j < n; j++){
        //         right_max = Math.max(right_max,height[j]);
        //     }

        //     int water = Math.min(left_max,right_max)-height[i];

        //     total_water += water;
        // }
        // return total_water;
    }
}