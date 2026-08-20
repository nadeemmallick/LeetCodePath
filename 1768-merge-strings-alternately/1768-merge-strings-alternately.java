class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        int first = 0;
        int second = 0;

        while (first < word1.length() && second < word2.length()) {
            ans.append(word1.charAt(first));
            ans.append(word2.charAt(second));

            first++;
            second++;
        }
        while (first < word1.length()) {
            ans.append(word1.charAt(first));
            first++;

        }
        while (second < word2.length()) {
            ans.append(word2.charAt(second));
            second++;
        }
        return ans.toString();

    }
}