/*
=========================================
PRIME NUMBER IN JAVA
=========================================

Approach 1: Simple Approach
Time Complexity: O(n)
Space Complexity: O(1)

Approach 2: Recursion
Time Complexity: O(n)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class PrimeNumber {

    // Approach 1: Simple Approach
    public static boolean isPrimeSimple(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Approach 2: Recursion
    public static boolean isPrimeRecursion(int n, int i) {

        if (n <= 1) {
            return false;
        }

        if (i == n) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return isPrimeRecursion(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(
                "Simple Approach: "
                        + isPrimeSimple(n));

        System.out.println(
                "Recursion Approach: "
                        + isPrimeRecursion(n, 2));

        sc.close();
    }
}
