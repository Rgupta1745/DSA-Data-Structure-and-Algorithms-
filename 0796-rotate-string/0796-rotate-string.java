class Solution {

    public static void reverse(char[] ch, int i, int k) {
        while (i < k) {
            char temp = ch[i];
            ch[i] = ch[k];
            ch[k] = temp;
            i++;
            k--;
        }
    }

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;

        // Try all rotations
        for (int i = 0; i < s.length(); i++) {

            char[] ch = s.toCharArray();

            // Step 1: reverse whole array
            reverse(ch, 0, ch.length - 1);

            // Step 2: reverse first part
            reverse(ch, 0, ch.length - i - 1);

            // Step 3: reverse second part
            reverse(ch, ch.length - i, ch.length - 1);

            // Convert back to string
            String rotated = new String(ch);

            if (rotated.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}