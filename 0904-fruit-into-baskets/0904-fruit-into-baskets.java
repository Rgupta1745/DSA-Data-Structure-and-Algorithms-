
import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to the map
            map.put(fruits[right],
                map.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types, shrink window
            while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                // Remove fruit type if its frequency becomes 0
                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            // Update maximum fruits collected
            maxFruits = Math.max(
                maxFruits, right - left + 1
            );
        }

        return maxFruits;
    }
}
