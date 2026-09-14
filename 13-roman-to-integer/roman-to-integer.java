class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int n = 0;

            if (s.charAt(i) == 'I') n = 1;
            if (s.charAt(i) == 'V') n = 5;
            if (s.charAt(i) == 'X') n = 10;
            if (s.charAt(i) == 'L') n = 50;
            if (s.charAt(i) == 'C') n = 100;
            if (s.charAt(i) == 'D') n = 500;
            if (s.charAt(i) == 'M') n = 1000;

            if (i + 1 < s.length() && n < value(s.charAt(i + 1)))
                ans -= n;
            else
                ans += n;
        }

        return ans;
    }

    int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}