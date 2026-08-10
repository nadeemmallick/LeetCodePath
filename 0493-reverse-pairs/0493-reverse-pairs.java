class Solution {
    public int reversePairs(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int ans = mergeSort(nums, s, e);
        return ans;
    }

    public static int mergeSort(int[] nums, int s, int e) {
        if (s > e) {
            return 0;
        }
        if (s == e) {
            return 0;
        }

        int mid = (s + e) / 2;

        int leftinversion = mergeSort(nums, s, mid);

        int rightinversion = mergeSort(nums, mid + 1, e);

        int intermidiate = merge(nums, s, e, mid);

        return leftinversion + rightinversion + intermidiate;

    }

    public static int merge(int[] nums, int s, int e, int mid) {
        int count = 0;
        int j = mid + 1;
        for (int i = s; i <= mid; i++) {
            while (j <= e && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        int leftArrlen = mid - s + 1;
        int rightArrlen = e - mid;

        int leftArr[] = new int[leftArrlen];
        int rightArr[] = new int[rightArrlen];

        int k = s;
        for (int i = 0; i < leftArrlen; i++) {
            leftArr[i] = nums[k];
            k++;
        }

        k = mid + 1;
        for (j = 0; j < rightArrlen; j++) {
            rightArr[j] = nums[k];
            k++;
        }

        int i = 0;
         j = 0;
        k = s;
        while (i < leftArrlen && j < rightArrlen) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                k++;
                i++;
            } else {
                nums[k] = rightArr[j];
                k++;
                j++;
            }
        }

        while (i < leftArrlen) {
            nums[k] = leftArr[i];
            k++;
            i++;
        }

        while (j < rightArrlen) {
            nums[k] = rightArr[j];
            k++;
            j++;
        }
        return count;
    }
}