import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        for (int candies : aliceSizes) {
            sumA += candies;
        }

        for (int candies : bobSizes) {
            sumB += candies;
        }

        int diff = (sumA - sumB) / 2;

        Set<Integer> bobBoxes = new HashSet<>();

        for (int candies : bobSizes) {
            bobBoxes.add(candies);
        }

        for (int x : aliceSizes) {
            int y = x - diff;

            if (bobBoxes.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[0];
    }
}
