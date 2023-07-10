public class DecimalToBinary {
      public static void decToBin(int decNum) {
            int binNum = 0;
            int pow = 0;
            int myNum = decNum;
            while (decNum > 0) {
                  int binDigit = decNum % 2;
                  decNum = decNum / 2;
                  binNum = binNum + (binDigit * (int) Math.pow(10, pow));
                  pow++;
            }

            System.out.println("Binary form of Decimal number " + myNum + " is " + binNum);
      }

      public static void main(String args[]) {
            decToBin(4);
      }
}
