class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len = 0;
        int left = 0;
        Set<Character> str = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (str.contains(s.charAt(right))) {
                str.remove(s.charAt(left));
                left++;
            }
            str.add(s.charAt(right));
            len = Math.max(len, right - left + 1);
        }

        return len;
    }
}
