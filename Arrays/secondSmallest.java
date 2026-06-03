/*
=========================================
SECOND SMALLEST ELEMENT IN ARRAY
=========================================

Approach 1: Two Variables (Optimal)
Time Complexity: O(n)
Space Complexity: O(1)

Approach 2: Selection Sort
Time Complexity: O(n²)
Space Complexity: O(1)

Approach 3: Recursion
Time Complexity: O(n)
Space Complexity: O(n)

=========================================
*/

import java.util.Scanner;

public class SecondSmallestElement {

    // Approach 1: Optimal
    public static int secondSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallest) {

                secondSmallest = smallest;
                smallest = num;
            }

            else if (num < secondSmallest
                    && num != smallest) {

                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    // Approach 2: Selection Sort
    public static int secondSmallestBySorting(int[] arr) {

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

        return arr[1];
    }

    // Approach 3: Recursion

    static int smallest = Integer.MAX_VALUE;
    static int secondSmallest = Integer.MAX_VALUE;

    public static void findSecondSmallestRecursive(
            int[] arr,
            int index) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] < smallest) {

            secondSmallest = smallest;
            smallest = arr[index];
        }

        else if (arr[index] < secondSmallest
                && arr[index] != smallest) {

            secondSmallest = arr[index];
        }

        findSecondSmallestRecursive(
                arr,
                index + 1);
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

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }

        System.out.println(
                "Optimal Approach: "
                        + secondSmallest(arr));

        System.out.println(
                "Selection Sort: "
                        + secondSmallestBySorting(arr1));

        findSecondSmallestRecursive(arr, 0);

        System.out.println(
                "Recursion: "
                        + secondSmallest);

        sc.close();
    }
}
