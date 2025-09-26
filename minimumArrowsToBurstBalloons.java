import java.util.*;
public class minimumArrowsToBurstBalloons {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(minArrows(points)); // Output: 2
    }

    public static int minArrows(int[][] arr) {
        // Sort the balloons based on their end coordinates
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1; // At least one arrow is needed
        int pos = arr[0][1]; // Position of the first arrow

        for (int i = 1; i < arr.length; i++) {
            // If the current balloon starts after the last arrow position,
            if (arr[i][0] > pos) {
                arrows++;  // we need a new arrow
                pos = arr[i][1]; // Update the position of the new arrow
            }
        }

        return arrows;
    }
}