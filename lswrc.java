public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                end++;
                maxLen = Math.max(maxLen, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return maxLen;
    }
}
