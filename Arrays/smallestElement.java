/*
=========================================
SMALLEST ELEMENT IN ARRAY
=========================================

Approach 1: Linear Traversal
Time Complexity: O(n)
Space Complexity: O(1)

Approach 2: Sorting (Selection Sort)
Time Complexity: O(n²)
Space Complexity: O(1)

Approach 3: Recursion
Time Complexity: O(n)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class SmallestElementInArray {

    // Approach 1: Linear Traversal
    public static int findSmallest(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Approach 2: Selection Sort
    public static int findSmallestBySorting(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[0];
    }

    // Approach 3: Recursion
    public static int findSmallestRecursive(
            int[] arr,
            int index,
            int min) {

        if (index == arr.length) {
            return min;
        }

        if (arr[index] < min) {
            min = arr[index];
        }

        return findSmallestRecursive(
                arr,
                index + 1,
                min);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
            arr2[i] = arr[i];
        }

        System.out.println(
                "Linear Traversal: "
                        + findSmallest(arr));

        System.out.println(
                "Selection Sort: "
                        + findSmallestBySorting(arr1));

        System.out.println(
                "Recursion: "
                        + findSmallestRecursive(
                                arr2,
                                0,
                                arr2[0]));

        sc.close();
    }
}
