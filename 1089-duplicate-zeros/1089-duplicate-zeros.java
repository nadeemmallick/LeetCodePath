class Solution {
    public void duplicateZeros(int[] arr) {
        int Zerocount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                Zerocount++;
            }
        }

        int i = arr.length - 1;
        int j = (arr.length + Zerocount) - 1;

        while (i >= 0) {

            if (arr[i] != 0) {

                if (j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
            } else {

                if (j < arr.length) {
                    arr[j] = 0;
                }
                j--;

                if (j < arr.length) {
                    arr[j] = 0;

                }
                j--;

            }
            i--;
        }

    }
}