class Solution {
    public void reverseString(char[] s) {
        // int i = 0;
        // int j = s.length -1;
        
        // while(i<j){
        //     char temp = s[i];
        //     s[i] = s[j];
        //     s[j] = temp;
        //     i++;
        //     j--;
        // }

        // for(int i = s.length -1; i>=0; i--){
        //     System.out.print(s[i]);
        // }

        int left = 0;
        int right= s.length-1;

        while(left  < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        
    }
}