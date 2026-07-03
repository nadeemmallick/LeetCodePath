class Solution {
    public static boolean isvalid(int[] position, int m, int mid) {
        int ballcount = 1;
        int magniticFieldPosition = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] - position[magniticFieldPosition] >= mid) {
                ballcount++;
                magniticFieldPosition = i;

                if (ballcount == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int s = 0;
        int e= position[n - 1] - position[0];
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isvalid(position,m,mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;

    }
}