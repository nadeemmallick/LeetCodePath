class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
         int i = 0;
        while(i < arr.length){

            int j = i;

            while(j < arr.length && arr[j] != ' '){
                j++;
            }

         int left = i;
         int right = j-1;

         while(left<right){
            char temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;

            left++;
            right--;
         }

         i = j+1;
        }
        return new String(arr);
        
    }
}