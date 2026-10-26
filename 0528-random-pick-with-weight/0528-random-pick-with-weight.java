
import java.util.*;

class Solution {

    int[] prefix;
    int total;
    Random random = new Random();

    public Solution(int[] w) {

        prefix = new int[w.length];
        total = 0;

        // Calculate Prefix Sum
        for (int i = 0; i < w.length; i++) {

            total += w[i];
            prefix[i] = total;
        }
    }

    public int pickIndex() {

        // Generate random target from 1 to total
        int target = random.nextInt(total) + 1;

        // Binary Search
        int low = 0;
        int high = prefix.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (prefix[mid] >= target) {
                high = mid;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
