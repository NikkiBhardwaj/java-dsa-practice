/*
=========================================
QUICK SORT IN JAVA
=========================================

Time Complexity:
Best Case    : O(n log n)
Average Case : O(n log n)
Worst Case   : O(n²)

Space Complexity:
O(log n) (Recursion Stack)

Stable Sort  : No
In-Place     : Yes

Approach:
1. Select a pivot element.
2. Place pivot at its correct position.
3. Elements smaller than pivot go left.
4. Elements greater than pivot go right.
5. Recursively sort left and right parts.

=========================================
*/

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
