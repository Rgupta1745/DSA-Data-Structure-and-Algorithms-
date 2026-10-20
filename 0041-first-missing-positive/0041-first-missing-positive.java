class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num] = true;
            }
        }

        for (int value = 1; value <= n; value++) {
            if (!seen[value]) {
                return value;
            }
        }

        return n + 1;
    }
}