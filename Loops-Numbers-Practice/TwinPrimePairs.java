/*
=========================================
TWIN PRIME PAIRS UP TO N
=========================================

A Twin Prime Pair consists of two
prime numbers whose difference is 2.

Examples:
(3, 5)
(5, 7)
(11, 13)
(17, 19)

-----------------------------------------

Approach 1: Simple Iteration

Time Complexity: O(n²)
Space Complexity: O(1)

-----------------------------------------

Approach 2: Recursion

Time Complexity: O(n²)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class TwinPrimePairs {

    // =========================================
    // Approach 1: Simple Iteration
    // =========================================

    public static boolean isPrimeSimple(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printTwinPrimePairsSimple(int n) {

        for (int i = 2; i <= n - 2; i++) {

            if (isPrimeSimple(i)
                    && isPrimeSimple(i + 2)) {

                System.out.println(
                        "(" + i + ", "
                                + (i + 2) + ")");
            }
        }
    }

    // =========================================
    // Approach 2: Recursion
    // =========================================

    public static boolean isPrimeRecursion(
            int num,
            int divisor) {

        if (num <= 1) {
            return false;
        }

        if (divisor == num) {
            return true;
        }

        if (num % divisor == 0) {
            return false;
        }

        return isPrimeRecursion(
                num,
                divisor + 1);
    }

    public static void printTwinPrimePairsRecursion(
            int current,
            int n) {

        if (current + 2 > n) {
            return;
        }

        if (isPrimeRecursion(current, 2)
                && isPrimeRecursion(
                        current + 2,
                        2)) {

            System.out.println(
                    "(" + current + ", "
                            + (current + 2) + ")");
        }

        printTwinPrimePairsRecursion(
                current + 1,
                n);
    }

    // =========================================
    // Main Method
    // =========================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(
                "\nTwin Prime Pairs (Simple):");

        printTwinPrimePairsSimple(n);

        System.out.println(
                "\nTwin Prime Pairs (Recursion):");

        printTwinPrimePairsRecursion(
                2,
                n);

        sc.close();
    }
}
