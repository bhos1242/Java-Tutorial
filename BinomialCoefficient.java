import java.util.*;

public class BinomialCoefficient {
      public static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                  fact = fact * i;
            }
            return fact;
      }

      public static int binCoeff(int n, int r) {
            int fn = factorial(n);
            int fr = factorial(r);
            int frn = factorial(n - r);

            return (fn / (fr * frn));
      }

      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int r = sc.nextInt();

            int BinomialCoefficient = binCoeff(n, r);

            System.out.println(BinomialCoefficient);
      }
}
