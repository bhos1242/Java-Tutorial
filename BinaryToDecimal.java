import java.util.*;
import java.lang.Math;

public class BinaryToDecimal {
      public static void binToDec(int binNum) {
            int dec = 0;
            int i = 0;
            int myNum = binNum;
            while (binNum > 0) {
                  int lastDigit = (binNum % 10);
                  binNum = binNum / 10;
                  dec = dec + (lastDigit * (int) (Math.pow(2, i)));
                  i++;
            }
            System.out.println("Decimal of " + myNum + " is " + dec);
      }

      public static void main(String args[]) {
            binToDec(101);
            binToDec(111);
      }
}
