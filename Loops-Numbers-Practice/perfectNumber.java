/*
=========================================
PERFECT NUMBER
=========================================

A Perfect Number is a number whose
sum of proper divisors (excluding itself)
is equal to the number.

Example:

6  -> 1 + 2 + 3 = 6
28 -> 1 + 2 + 4 + 7 + 14 = 28

-----------------------------------------

Approach 1: Iterative

Time Complexity: O(n)
Space Complexity: O(1)

-----------------------------------------

Approach 2: Recursion

Time Complexity: O(n)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class PerfectNumber {

    // =========================================
    // Approach 1: Iterative
    // =========================================

    public static boolean isPerfectIterative(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    // =========================================
    // Approach 2: Recursion
    // =========================================

    public static int divisorSum(int num, int divisor) {

        if (divisor == num) {
            return 0;
        }

        if (num % divisor == 0) {
            return divisor + divisorSum(num, divisor + 1);
        }

        return divisorSum(num, divisor + 1);
    }

    public static boolean isPerfectRecursion(int num) {

        return divisorSum(num, 1) == num;
    }

    // =========================================
    // Main Method
    // =========================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println("\nIterative Approach:");

        if (isPerfectIterative(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }

        System.out.println("\nRecursive Approach:");

        if (isPerfectRecursion(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }

        sc.close();
    }
}
