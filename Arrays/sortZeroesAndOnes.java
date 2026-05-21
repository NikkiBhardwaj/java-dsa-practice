// Sort Zeroes and Ones in an Array

import java.util.Arrays;

public class SortZeroesAndOnes {

    // -----------------------------------
    // Approach 1: Brute Force using Sorting
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void sortUsingBuiltInSort(int[] arr) {

        Arrays.sort(arr);

        System.out.println(
            "Using Built-in Sorting:"
        );

        printArray(arr);
    }

    // -----------------------------------
    // Approach 2: Counting Zeroes and Ones
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void sortUsingCounting(int[] arr) {

        int zeroCount = 0;

        // Count zeroes
        for(int num : arr) {

            if(num == 0) {

                zeroCount++;
            }
        }

        // Fill zeroes
        for(int i = 0; i < zeroCount; i++) {

            arr[i] = 0;
        }

        // Fill ones
        for(int i = zeroCount;
            i < arr.length;
            i++) {

            arr[i] = 1;
        }

        System.out.println(
            "Using Counting Approach:"
        );

        printArray(arr);
    }

    // -----------------------------------
    // Approach 3: Two Pointer Optimized
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void sortUsingTwoPointers(
            int[] arr
    ) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            // Move left if already 0
            while(arr[left] == 0
                    && left < right) {

                left++;
            }

            // Move right if already 1
            while(arr[right] == 1
                    && left < right) {

                right--;
            }

            // Swap
            if(left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(
            "Using Two Pointer Approach:"
        );

        printArray(arr);
    }

    // Function to print array
    static void printArray(int[] arr) {

        for(int num : arr) {

            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 =
                {1, 0, 1, 0, 1, 0, 0, 1};

        int[] arr2 =
                {1, 0, 1, 0, 1, 0, 0, 1};

        int[] arr3 =
                {1, 0, 1, 0, 1, 0, 0, 1};

        sortUsingBuiltInSort(arr1);

        sortUsingCounting(arr2);

        sortUsingTwoPointers(arr3);
    }
}
