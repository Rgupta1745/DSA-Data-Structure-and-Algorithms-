
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Store frequency of characters in s1
        for (int i = 0; i < n; i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        // Create the first window in s2
        for (int i = 0; i < n; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (matches(count1, count2)) {
            return true;
        }

        // Slide the window
        for (int right = n; right < m; right++) {

            // Remove outgoing character
            count2[s2.charAt(right - n) - 'a']--;

            // Add incoming character
            count2[s2.charAt(right) - 'a']++;

            if (matches(count1, count2)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] count1, int[] count2) {

        for (int i = 0; i < 26; i++) {

            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}
