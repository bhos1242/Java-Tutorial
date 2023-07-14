import java.util.*;

public class LargestInMatrix {

      public static int largest(int arr[][]) {
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[0].length; j++) {
                        if (arr[i][j] > largest) {
                              largest = arr[i][j];
                        }
                  }
            }
            return largest;
      }

      public static void main(String args[]) {
            int matrix[][] = new int[3][3];
            int n = matrix.length, m = matrix[0].length;

            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        matrix[i][j] = sc.nextInt();
                  }
            }
            int largest = largest(matrix);
            System.out.println("Largest element in array is " + largest);
            // output
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        System.out.print(matrix[i][j] + " ");
                  }
                  System.out.println();
            }
            sc.close();
      }
}
