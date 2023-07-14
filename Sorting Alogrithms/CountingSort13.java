import java.util.*;

public class CountingSort13 {
      public static void countingSort(int arr[]) {
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] > largest) {
                        largest = arr[i];
                  }
            }
            int count[] = new int[largest + 1];
            for (int i = 0; i < arr.length; i++) {
                  count[arr[i]]++;
            }

            // sorting
            int j = 0;
            for (int i = 0; i < count.length; i++) {
                  while (count[i] > 0) {
                        arr[j] = i;
                        j++;
                        count[i]--;

                  }
            }
      }

      public static void main(String args[]) {
            int arr[] = { 5, 4, 1, 2, 3, 2 };
            countingSort(arr);
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }
}
