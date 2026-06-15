/*
=========================================
GCD OF TWO NUMBERS IN JAVA
=========================================

Approach 1: Iterative Euclidean Algorithm
Time Complexity: O(log(min(n1, n2)))
Space Complexity: O(1)

Approach 2: Recursive Euclidean Algorithm
Time Complexity: O(log(min(n1, n2)))
Space Complexity: O(log(min(n1, n2)))

=========================================
*/

import java.util.Scanner;

public class GCDOfTwoNumbers {

    // Approach 1: Iterative
    public static int gcdIterative(int n1, int n2) {

        while (n2 != 0) {

            int remainder = n1 % n2;

            n1 = n2;
            n2 = remainder;
        }

        return n1;
    }

    // Approach 2: Recursion
    public static int gcdRecursion(int n1, int n2) {

        if (n2 == 0) {
            return n1;
        }

        return gcdRecursion(n2, n1 % n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println(
                "Iterative GCD: "
                        + gcdIterative(n1, n2));

        System.out.println(
                "Recursive GCD: "
                        + gcdRecursion(n1, n2));

        sc.close();
    }
}
