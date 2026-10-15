class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        int left = 0;
        int right = 0;
        int windowSize = p.length();
        while (right < s.length()) {
            count[s.charAt(right) - 'a']--;
            if (right - left + 1 > windowSize) {
                count[s.charAt(left) - 'a']++;
                left++;
            }
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