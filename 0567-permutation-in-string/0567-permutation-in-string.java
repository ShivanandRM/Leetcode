class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency of characters in s1
        int[] need = new int[26];

        // Frequency of characters in current window
        int[] window = new int[26];

        // Build frequency of s1
        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            // Character enters the window
            window[s2.charAt(right) - 'a']++;

            // Keep window size equal to s1.length()
            if (right - left + 1 > s1.length()) {

                // Character leaves the window
                window[s2.charAt(left) - 'a']--;

                left++;
            }

            // Check whether current window is a permutation of s1
            if (Arrays.equals(need, window)) {
                return true;
            }
        }
        return false;
    }
}