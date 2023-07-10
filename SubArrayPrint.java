import java.util.*;

public class SubArrayPrint {
      public static void printSubarr(int arr[]) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                  int start = i;
                  for (int j = i; j < arr.length; j++) {
                        int end = j;

                        int sum = 0;
                        for (int k = start; k <= end; k++) {
                              System.out.print(arr[k] + " ");
                              sum = sum + arr[k];
                              if (sum > max) {
                                    max = sum;
                              }
                        }
                        System.out.println(" ");
                        System.out.println("Sum for above subarray: " + sum);
                  }
                  System.out.println("");
            }
            System.out.println("Maximum subarray sum is: " + max);
      }

      public static void main(String args[]) {
            int arr[] = { 2, 4, 5, 6, 7, 45 };
            printSubarr(arr);
      }
}
