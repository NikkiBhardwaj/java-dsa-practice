/*
=========================================
TWIN PRIME NUMBER
=========================================

Two numbers are Twin Prime if:
1. Both numbers are Prime
2. Difference between them is 2

Examples:
(3, 5)
(11, 13)

-----------------------------------------

Approach 1: Simple

Time Complexity: O(n)
Space Complexity: O(1)

-----------------------------------------

Approach 2: Recursion

Time Complexity: O(n)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class TwinPrimeNumber {

    // =========================================
    // Approach 1: Simple
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

    public static boolean isTwinPrimeSimple(
            int n1,
            int n2) {

        return Math.abs(n1 - n2) == 2
                && isPrimeSimple(n1)
                && isPrimeSimple(n2);
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

    public static boolean isTwinPrimeRecursion(
            int n1,
            int n2) {

        return Math.abs(n1 - n2) == 2
                && isPrimeRecursion(n1, 2)
                && isPrimeRecursion(n2, 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();

        System.out.println(
                "\nSimple: "
                        + isTwinPrimeSimple(
                                n1,
                                n2));

        System.out.println(
                "Recursion: "
                        + isTwinPrimeRecursion(
                                n1,
                                n2));

        sc.close();
    }
}
