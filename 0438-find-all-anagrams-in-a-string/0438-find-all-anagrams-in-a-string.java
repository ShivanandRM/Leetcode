class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) {
            return result;
        }

        int[] count = new int[26];

        // Store frequency of characters in p
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int windowSize = p.length();

        while (right < s.length()) {

            // Add current character
            count[s.charAt(right) - 'a']--;

            // If window size exceeds p.length()
            if (right - left + 1 > windowSize) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            // Check if current window is an anagram
            if (right - left + 1 == windowSize) {
                boolean isAnagram = true;

                for (int i = 0; i < 26; i++) {
                    if (count[i] != 0) {
                        isAnagram = false;
                        break;
                    }
                }

                if (isAnagram) {
                    result.add(left);
                }
            }

            right++;
        }

        return result;  
    }
}