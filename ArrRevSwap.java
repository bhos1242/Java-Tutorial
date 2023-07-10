import java.util.*;

public class ArrRevSwap {
      public static void swap(int arr[], int a, int b) {
            int temp;
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

      }

      public static void arrRev(int arr[]) {
            int i = 0;
            int j = arr.length - 1;
            while (i != j) {
                  swap(arr, i, j);
                  i++;
                  j--;
            }
      }

      public static void main(String arg[]) {
            int arr[] = { 1, 2, 3, 4, 5 };
            arrRev(arr);
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }
}
