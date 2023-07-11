import java.util.*;

public class TappingRainWater11 {
      public static void trappedWater(int arr[], int width) {

            int n = arr.length;
            if (n < 3) {
                  System.out.println("No water is trapped");
            } else {
                  int left_max[] = new int[n];
                  int right_max[] = new int[n];
                  int wt = 0;

                  left_max[0] = arr[0];
                  for (int i = 1; i < n; i++) {
                        left_max[i] = Math.max(left_max[i - 1], arr[i]);
                  }
                  // Calculate the maximum height of bars to the right of each bar
                  right_max[n - 1] = arr[n - 1];
                  for (int i = n - 2; i >= 0; i--) {
                        right_max[i] = Math.max(right_max[i + 1], arr[i]);
                  }

                  // caluculate the trapped water for each bar
                  for (int i = 1; i < n - 1; i++) {
                        int minHeight = Math.min(left_max[i], right_max[i]);
                        wt += minHeight - arr[i];
                  }
                  System.out.println("Total water trapped: " + wt * width);
            }
      }

      public static void main(String args[]) {
            int height[] = { 4, 2, 0, 6, 3, 2, 5 };
            int width = 1;
            trappedWater(height, width);

      }
}
