import java.util.*;

public class LargestInArray {
      public static int getLargest(int arr[]) {
            int largest = Integer.MIN_VALUE;// -infinity
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] > largest) {
                        largest = arr[i];
                  }
            }
            return largest;
      }

      public static void main(String args[]) {
            int arr[] = { 1, 34, 54, 64, 34, 56, 44, 85 };

            int res = getLargest(arr);
            System.out.println("Largest Element of given array is: " + res);
      }
}
