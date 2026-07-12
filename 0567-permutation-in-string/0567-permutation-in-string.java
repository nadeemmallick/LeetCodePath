class Solution {

    public boolean compareFrequency(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        //basic check
        if (s1.length() > s2.length()) {
            return false;
        }

        //create s1 freq table
        int count1[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        //compare first window
        int i = 0;
        int count2[] = new int[26];
        int windowLength = s1.length();
        //first window freq table
        for (i = 0; i < windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        //main compare
        if (compareFrequency(count1, count2) == true) {
            return true;
        } else {
            //if the first compare is not full fill the requirement then process the remain windows

            while (i < s2.length()) {
                // new character and in freq table
                char newchar = s2.charAt(i);
                int newcharIndex = newchar - 'a';
                count2[newcharIndex]++;

                //old index ko count 2 se remove kro

                // char oldindex = i - windowLength;
                // char oldchar = s2.charAt(oldindex);
                // int freqTableOfOldChar = oldchar - 'a';
                int oldIndex = i - windowLength;
                char oldChar = s2.charAt(oldIndex);
                int freqTableOfOldChar = oldChar - 'a';
                count2[freqTableOfOldChar]--;
                
                if (compareFrequency(count1, count2) == true) {
                    return true;
                }
                i++;

            }

        }
        return false;

    }
}