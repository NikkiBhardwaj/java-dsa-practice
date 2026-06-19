/*
=========================================
TWISTED PRIME NUMBER
=========================================

A number is Twisted Prime if:
1. Number is Prime
2. Reverse of number is also Prime

Example:
13 -> 31

13 is Prime
31 is Prime

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

public class TwistedPrimeNumber {

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

    public static int reverseSimple(int num) {

        int reverse = 0;

        while (num > 0) {

            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return reverse;
    }

    public static boolean isTwistedPrimeSimple(
            int num) {

        int reverse =
                reverseSimple(num);

        return isPrimeSimple(num)
                && isPrimeSimple(reverse);
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

    public static int reverseRecursion(
            int num,
            int reverse) {

        if (num == 0) {
            return reverse;
        }

        return reverseRecursion(
                num / 10,
                reverse * 10 + num % 10);
    }

    public static boolean isTwistedPrimeRecursion(
            int num) {

        int reverse =
                reverseRecursion(
                        num,
                        0);

        return isPrimeRecursion(
                num,
                2)
                && isPrimeRecursion(
                        reverse,
                        2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(
                "\nSimple: "
                        + isTwistedPrimeSimple(
                                num));

        System.out.println(
                "Recursion: "
                        + isTwistedPrimeRecursion(
                                num));

        sc.close();
    }
}
