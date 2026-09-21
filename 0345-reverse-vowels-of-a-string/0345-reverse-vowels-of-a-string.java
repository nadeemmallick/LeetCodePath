class Solution {

    private boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            // i ko vowel tak le jao
            while (i < j && !isvowel(arr[i])) {
                i++;
            }

            // j ko vowel tak le jao
            while (i < j && !isvowel(arr[j])) {
                j--;
            }

            // dono vowel hain to swap karo
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        return new String(arr);

    }
}