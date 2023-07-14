import java.util.*;

public class SelectionSort12 {
      public static void swap(int arr[], int a, int b) {
            int temp;
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

      }

      public static void selectionSort(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                  int min = i;
                  for (int j = i + 1; j < n; j++) {
                        if (arr[min] > arr[j]) {
                              min = j;
                        }
                  }
                  // swap
                  swap(arr, i, min);

            }

      }

      public static void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }

      public static void main(String args[]) {
            int arr[] = { 5, 1, 3, 2, 4 };
            selectionSort(arr);
            printArray(arr);
      }
}
