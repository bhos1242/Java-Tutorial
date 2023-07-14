import java.util.*;

public class InsertionSort12 {
      public static void insertionSort(int arr[]) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                  int temp = i;
                  int j = i - 1;
                  while (j >= 0 && arr[j] > temp) {
                        arr[j + 1] = arr[j];
                        j--;
                  }
                  arr[j + 1] = (int) temp;
            }
      }

      public static void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }

      public static void main(String args[]) {
            int arr[] = { 2, 35, 4, 3, 2, 64 };
            insertionSort(arr);
            printArray(arr);
      }
}
