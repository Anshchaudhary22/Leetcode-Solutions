import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort intervals by their end coordinate in ascending order.
        // Use Integer.compare to prevent integer overflow.
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int minArrows = 1;
        long end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the last arrow position,
            // we need a new arrow.
            if (points[i][0] > end) {
                minArrows++;
                end = points[i][1];
            }
        }

        return minArrows;
    }
}

