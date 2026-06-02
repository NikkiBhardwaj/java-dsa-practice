/*
=========================================
LINEAR SEARCH IN JAVA
=========================================

Time Complexity:
Best Case    : O(1)
Average Case : O(n)
Worst Case   : O(n)

Space Complexity:
O(1)

Approach:
1. Traverse the array from start to end.
2. Compare each element with the target.
3. If found, return its index.
4. Otherwise return -1.

=========================================
*/

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
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

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println(
                "Element found at index: " + result
            );
        } else {
            System.out.println(
                "Element not found"
            );
        }

        sc.close();
    }
}
