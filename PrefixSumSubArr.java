
//optimized code to find sum of subarray
import java.util.*;

public class PrefixSumSubArr {
      public static void maxSum(int arr[]) {
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[arr.length];
            int currSum = 0;
            prefix[0] = arr[0];
            // calculate prefix array
            for (int i = 1; i < prefix.length; i++) {
                  prefix[i] = prefix[i - 1] + arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                  int start = i;
                  for (int j = 1; j < arr.length; j++) {
                        int end = j;
                        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                        if (maxSum < currSum) {
                              maxSum = currSum;
                        }

                  }
            }
            System.out.println("Max sum: " + maxSum);
      }

      public static void main(String args[]) {
            int arr[] = { 1, -2, 1, 6, 2 };
            maxSum(arr);
      }
}

// Here's an explanation of how the code works:

// The maxSum method takes an integer array arr as input.
// It initializes maxSum to the minimum possible integer value,
// Integer.MIN_VALUE, which will be updated to store the maximum sum.
// It creates a new integer array prefix of the same length as arr to store the
// prefix sums.
// It initializes currSum to 0, which will be used to calculate the sum of
// subarrays.
// It calculates the prefix sums by iterating over the arr and storing the
// cumulative sum up to each element in the prefix array.
// The nested loops are used to find the maximum sum of subarrays:
// The outer loop iterates over each element of the array. It sets the start
// variable to the current element.
// The inner loop iterates from start to the end of the array. It sets the end
// variable to the current element.
// It calculates the sum of the subarray from start to end using the prefix
// sums. If start is 0, the sum is directly the value at prefix[end]. Otherwise,
// it is calculated as prefix[end] - prefix[start - 1].
// If the calculated currSum is greater than the current maxSum, it updates
// maxSum.
// Finally, it prints the maxSum, which represents the maximum sum of any
// subarray in the input array.
// In the main method, an example array { 1, -2, 1, 6, 2 } is created, and the
// maxSum method is called with this array as an argument.

// The program efficiently calculates the maximum sum of subarrays using prefix
// sums, improving the time complexity compared to other brute-force approaches.