class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int left = 0;
        int matches = 0;

        for (int right = 0; right < s2.length(); right++) {

            int index = s2.charAt(right) - 'a';

            window[index]++;

            // Only track characters that s1 actually needs
            if (need[index] > 0) {

                if (window[index] == need[index]) {
                    matches++;
                }

                else if (window[index] == need[index] + 1) {
                    matches--;
                }
            }

            // Keep fixed window size
            if (right - left + 1 > s1.length()) {

                int leftIndex = s2.charAt(left) - 'a';

                if (need[leftIndex] > 0) {

                    if (window[leftIndex] == need[leftIndex]) {
                        matches--;
                    }

                    else if (window[leftIndex] == need[leftIndex] + 1) {
                        matches++;
                    }
                }

                window[leftIndex]--;

                left++;
            }

            // Number of distinct required characters in s1
            int required = 0;

            for (int i = 0; i < 26; i++) {
                if (need[i] > 0) {
                    required++;
                }
            }

            if (matches == required) {
                return true;
            }
        }

        return false;
    }
}