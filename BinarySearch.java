import java.util.*;

public class BinarySearch {
      public static int binSearch(int arr[], int key) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = (start + end) / 2;
                  if (key == arr[mid]) {
                        return mid;
                  } else if (key > arr[mid]) {
                        start = mid + 1;
                  } else {
                        end = mid - 1;
                  }
            }
            return -1;
      }

      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
            int key = sc.nextInt();

            int res = binSearch(arr, key);
            if (res == -1) {
                  System.out.println("Given key element " + key + " is not found in the given array");
            } else {
                  System.out.println("Given key element " + key + " is found at position " + res);
            }
            sc.close();
      }
}
