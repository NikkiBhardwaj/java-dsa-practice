/*
=========================================
SPECIAL NUMBER
=========================================

A number is Special if the sum of
factorials of its digits is equal
to the number itself.

Example:
145

1! + 4! + 5!
= 1 + 24 + 120
= 145

-----------------------------------------

Approach 1: Simple

Time Complexity: O(d)
Space Complexity: O(1)

-----------------------------------------

Approach 2: Recursion

Time Complexity: O(d)
Space Complexity: O(d)

where d = number of digits

=========================================
*/

import java.util.Scanner;

public class SpecialNumber {

    // =========================================
    // Approach 1: Simple
    // =========================================

    public static int factorialSimple(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isSpecialSimple(
            int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += factorialSimple(
                    digit);

            num /= 10;
        }

        return sum == original;
    }

    // =========================================
    // Approach 2: Recursion
    // =========================================

    public static int factorialRecursion(
            int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n
                * factorialRecursion(
                        n - 1);
    }

    public static int sumOfFactorials(
            int num) {

        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        return factorialRecursion(
                digit)
                + sumOfFactorials(
                        num / 10);
    }

    public static boolean isSpecialRecursion(
            int num) {

        return num
                == sumOfFactorials(
                        num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(
                "\nSimple: "
                        + isSpecialSimple(
                                num));

        System.out.println(
                "Recursion: "
                        + isSpecialRecursion(
                                num));

        sc.close();
    }
}
