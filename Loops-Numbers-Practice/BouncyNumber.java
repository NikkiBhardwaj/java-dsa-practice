/*
=========================================
BOUNCY NUMBER IN JAVA
=========================================

Approach 1: Using Flags
Time Complexity: O(d)
Space Complexity: O(1)

Approach 2: Using Recursion
Time Complexity: O(d)
Space Complexity: O(d)

=========================================
*/

import java.util.Scanner;

public class BouncyNumber {

    // Approach 1: Using Flags
    public static boolean isBouncyUsingFlags(int num) {

        boolean increasing = false;
        boolean decreasing = false;

        while (num >= 10) {

            int lastDigit = num % 10;
            int secondLastDigit = (num / 10) % 10;

            if (lastDigit > secondLastDigit) {
                increasing = true;
            }

            if (lastDigit < secondLastDigit) {
                decreasing = true;
            }

            if (increasing && decreasing) {
                return true;
            }

            num = num / 10;
        }

        return false;
    }

    // Variables for Recursion
    static boolean increasing;
    static boolean decreasing;

    // Approach 2: Recursion
    public static void checkBouncyRecursion(int num) {

        if (num < 10) {
            return;
        }

        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;

        if (lastDigit > secondLastDigit) {
            increasing = true;
        }

        if (lastDigit < secondLastDigit) {
            decreasing = true;
        }

        checkBouncyRecursion(num / 10);
    }

    public static boolean isBouncyUsingRecursion(int num) {

        increasing = false;
        decreasing = false;

        checkBouncyRecursion(num);

        return increasing && decreasing;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(
                "Using Flags: "
                        + isBouncyUsingFlags(num));

        System.out.println(
                "Using Recursion: "
                        + isBouncyUsingRecursion(num));

        sc.close();
    }
}
