/*
=========================================
FIBONACCI SERIES
=========================================

A Fibonacci Series is a sequence in
which each number is the sum of the
previous two numbers.

Example:

0 1 1 2 3 5 8 13 21 ...

-----------------------------------------

Approach 1: Iterative

Time Complexity: O(n)
Space Complexity: O(1)

-----------------------------------------

Approach 2: Recursion

Time Complexity: O(2^n)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class FibonacciSeries {

    // =========================================
    // Approach 1: Iterative
    // =========================================

    public static void fibonacciIterative(int n) {

        int first = 0;
        int second = 1;

        System.out.print("Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    // =========================================
    // Approach 2: Recursion
    // =========================================

    public static int fibonacciRecursion(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacciRecursion(n - 1)
                + fibonacciRecursion(n - 2);
    }

    public static void printFibonacciRecursion(int n) {

        System.out.print("Series: ");

        for (int i = 0; i < n; i++) {

            System.out.print(
                    fibonacciRecursion(i)
                            + " ");
        }

        System.out.println();
    }

    // =========================================
    // Main Method
    // =========================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Terms: ");

        int n = sc.nextInt();

        System.out.println(
                "\nIterative Approach:");

        fibonacciIterative(n);

        System.out.println(
                "\nRecursive Approach:");

        printFibonacciRecursion(n);

        sc.close();
    }
}
