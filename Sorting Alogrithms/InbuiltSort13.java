import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort13 {
      public static void main(String args[]) {
            Integer arr[] = { 5, 4, 1, 3, 2 };

            Arrays.sort(arr, 0, arr.length);
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }

            Arrays.sort(arr, 0, arr.length, Collections.reverseOrder());
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }

      }
}
