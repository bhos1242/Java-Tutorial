import java.util.*;

public class StockProfitArr {
      public static void maxProfit(int arr[]) {
            int n = arr.length;
            // min buying value for each day
            int min_buy[] = new int[n];
            min_buy[0] = arr[0];
            for (int i = 1; i < n; i++) {
                  min_buy[i] = Math.min(min_buy[i - 1], arr[i]);
            }

            // find max profit value
            int max_profit[] = new int[n];
            max_profit[0] = 0;

            for (int i = 1; i < n; i++) {
                  max_profit[i] = arr[i] - min_buy[i];
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                  if (max_profit[i] > max) {
                        max = max_profit[i];
                  }
            }
            System.out.println("Maximun profit value is: " + max);

      }

      public static void main(String args[]) {
            int prices[] = { 7, 1, 5, 3, 6, 4 };
            maxProfit(prices);
      }
}
