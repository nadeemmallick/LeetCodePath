class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (start == end) {
                return nums[start];
            }

            int currentValue = nums[mid];

            int prevValue = -1;
            {
                if (mid - 1 >= 0) {
                    prevValue = nums[mid - 1];
                }
            }

            int nextValue = -1;
            {
                if (mid + 1 < n) {
                    nextValue = nums[mid + 1];
                }
            }

            if (currentValue != prevValue && currentValue != nextValue) {
                return currentValue;
            }

            if (currentValue != prevValue && currentValue == nextValue) {
                int StartingIndexPair = mid;
                if ((StartingIndexPair & 1) == 1) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (currentValue == prevValue && currentValue != nextValue) {
                int EndingIndexPair = mid;
                if ((EndingIndexPair & 1) == 1) {
                    start = mid + 1;
                } else {

                    end = mid - 1;
                }

            }
        }
        return -1;
    }
}