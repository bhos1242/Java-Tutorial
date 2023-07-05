import java.util.*;

public class TypeCasting {
      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            // case1
            float a = 25.12f;
            int b = (int) (a);
            System.out.println(b);

            // case2
            char ch = 'v';
            int number = (int) (ch);
            System.out.println(number);// gives ascii value

            int e = 10;
            float f = 20.23f;
            long c = 24;
            double d = 30;
            double and = e + f + c + d;
            System.out.println(and);

      }
}
