/*
=========================================
BINARY SEARCH IN JAVA
=========================================

Binary Search works only on
a sorted array.

Time Complexity:
Best Case    : O(1)
Average Case : O(log n)
Worst Case   : O(log n)

Space Complexity:
O(1)

=========================================
*/

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(
            int[] arr,
            int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left +
                    (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(
                "Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(
                "Enter element to search: ");

        int target = sc.nextInt();

        int result =
                binarySearch(arr, target);

        if (result != -1) {

            System.out.println(
                    "Element found at index: "
                            + result);
        }

        else {

            System.out.println(
                    "Element not found");
        }

        sc.close();
    }
}
