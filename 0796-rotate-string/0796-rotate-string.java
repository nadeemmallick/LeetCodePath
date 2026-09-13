class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String str = new String(s + s);

        if (str.contains(goal)) {
            return true;
        }
        return false;

    }
}