
class Solution {
    public int longestValidParentheses(String s) {

        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j += 2) {

                if (isValid(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public boolean isValid(String s, int start, int end) {

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}
