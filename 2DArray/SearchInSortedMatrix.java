public class SearchInSortedMatrix {
      public static boolean searchKey(int arr[][], int key) {
            int row = 0;
            int n = arr.length;
            int m = arr[0].length - 1;
            int col = m;

            while (row < n && col >= 0) {
                  if (arr[row][col] == key) {
                        System.out.println("Found key at (" + row + "," + col + ")");
                        return true;
                  }
                  if (key < arr[row][col]) {
                        col--;
                  } else {
                        row++;
                  }
            }
            System.out.println("Key not found in given matrix");
            return false;
      }

      public static void main(String args[]) {
            int matrix[][] = {
                        { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 }
            };
            searchKey(matrix, 34);

      }
}
