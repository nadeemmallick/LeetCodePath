class Solution {
    public String reverseWords(String s) {
        // String[] words = s.trim().split("\\s+");

        // StringBuilder ans = new StringBuilder();

        // for (int i = words.length - 1; i >= 0; i--) {

        //     ans.append(words[i]);

        //     if (i != 0) {
        //         ans.append(" ");
        //     }
        // }

        // return ans.toString();

        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }

            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            ans.append(s.substring(j + 1, i + 1));

            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            if (j >= 0) {
                ans.append(' ');
            }

            i = j;

        }
        return ans.toString();
    }
}