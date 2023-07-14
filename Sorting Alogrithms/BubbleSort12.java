import java.util.*;

public class BubbleSort12 {
      public static void swap(int arr[], int a, int b) {
            int temp;
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

      }

      public static void bubbleSort(int arr[]) {
            int n = arr.length;
            int swaps = 0;
            for (int i = 0; i < n - 1; i++) {
                  for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                              swap(arr, j, j + 1);
                              swaps++;
                        }
                  }
            }
            System.out.println("Number of swaps: " + swaps);
      }

      public static void main(String args[]) {
            int arr[] = { 5, 2, 3, 4, 1 };
            bubbleSort(arr);
            System.out.println("Array after sorting:");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }

      }
}
