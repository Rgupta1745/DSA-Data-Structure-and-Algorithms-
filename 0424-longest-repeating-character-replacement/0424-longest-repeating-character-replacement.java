
class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Get the current character
            char ch = s.charAt(right);

            // Update its frequency
            freq[ch - 'A']++;

            // Update maximum frequency
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // Check if window is invalid
            int windowSize = right - left + 1;

            if (windowSize - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
