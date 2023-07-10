import java.util.*;

public class LinearSearch {
      public static int linearSearch(int arr[], int key) {
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == key) {
                        return i;
                  }
            }
            return 0;
      }

      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int arr[] = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9 };
            System.out.println("Given array:");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }

            System.out.println("Enter the key element to find:");
            int key = sc.nextInt();
            sc.close();

            int result = linearSearch(arr, key);
            if (result == 0) {
                  System.out.println("Key Element " + key + " is not found in given array");
            } else {

                  System.out.println("Key Element " + key + " is found in given array at position " + result + 1);
            }
      }
}
