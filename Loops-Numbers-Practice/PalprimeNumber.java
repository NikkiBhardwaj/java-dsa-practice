/*
=========================================
PALPRIME NUMBER
=========================================

A Palprime Number is a number that is:
1. Palindrome
2. Prime

Examples:
2
3
5
7
11
101
131

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

public class PalprimeNumber {

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

    public static boolean isPalindromeSimple(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {

            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return original == reverse;
    }

    public static boolean isPalprimeSimple(int num) {

        return isPrimeSimple(num)
                && isPalindromeSimple(num);
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

    public static boolean isPalprimeRecursion(
            int num) {

        int reverse =
                reverseRecursion(
                        num,
                        0);

        return isPrimeRecursion(
                num,
                2)
                && num == reverse;
    }

    // =========================================
    // Main Method
    // =========================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(
                "\nSimple: "
                        + isPalprimeSimple(
                                num));

        System.out.println(
                "Recursion: "
                        + isPalprimeRecursion(
                                num));

        sc.close();
    }
}
