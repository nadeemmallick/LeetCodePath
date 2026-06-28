class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end- start)/2;

            if (arr[mid] < arr[mid + 1]) { //right jao
                start = mid + 1;

            } else {
                //arr[mid] > arr[mid+1] // left jao

                ans = mid;
                end = mid - 1;
            }
        }
        return ans;

    }
}