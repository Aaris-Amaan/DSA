class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];

        for (String str : strs) {
            while (!str.startsWith(s))
                s = s.substring(0, s.length() - 1);
        }

        return s;
    }
}