/*
=========================================
PALINDROME NUMBER IN JAVA
=========================================

Approach 1: Simple Approach
Time Complexity: O(log n)
Space Complexity: O(1)

Approach 2: Recursion
Time Complexity: O(log n)
Space Complexity: O(log n)

=========================================
*/

import java.util.Scanner;

public class PalindromeNumber {

    // Approach 1: Simple Approach
    public static boolean isPalindromeSimple(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    // Variable used in recursion
    static int reverseNumber = 0;

    // Approach 2: Recursion
    public static int reverseUsingRecursion(int num) {

        if (num == 0) {
            return reverseNumber;
        }

        int digit = num % 10;
        reverseNumber = reverseNumber * 10 + digit;

        return reverseUsingRecursion(num / 10);
    }

    public static boolean isPalindromeRecursion(int num) {

        reverseNumber = 0;

        int reversed = reverseUsingRecursion(num);

        return num == reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(
                "Simple Approach: "
                        + isPalindromeSimple(num));

        System.out.println(
                "Recursion Approach: "
                        + isPalindromeRecursion(num));

        sc.close();
    }
}
