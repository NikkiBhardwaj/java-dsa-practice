/*
=========================================
MISSING NUMBER IN ARRAY
=========================================

Given an array containing numbers
from 1 to n with one number missing.

Example:
Input: 1 2 4 5
Output: 3

=========================================

Approach 1: Linear Search
Time Complexity: O(n²)
Space Complexity: O(1)

Approach 2: HashSet
Time Complexity: O(n)
Space Complexity: O(n)

Approach 3: Sum Formula
Time Complexity: O(n)
Space Complexity: O(1)

=========================================
*/

import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {

    // Approach 1: Linear Search

    public static int findMissingLinear(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }

    // Approach 2: HashSet

    public static int findMissingHashSet(int[] arr, int n) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {

            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    // Approach 3: Sum Formula

    public static int findMissingSum(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println(
                "Enter " + (n - 1)
                        + " array elements:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                "Linear Search: "
                        + findMissingLinear(arr, n));

        System.out.println(
                "HashSet: "
                        + findMissingHashSet(arr, n));

        System.out.println(
                "Sum Formula: "
                        + findMissingSum(arr, n));

        sc.close();
    }
}
