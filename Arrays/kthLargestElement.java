/*
=========================================
KTH LARGEST ELEMENT IN ARRAY
=========================================

Approach 1: Selection Sort
Time Complexity: O(n²)
Space Complexity: O(1)

Approach 2: Quick Select
Average Time Complexity: O(n)
Worst Time Complexity: O(n²)
Space Complexity: O(1)

=========================================
*/

import java.util.Scanner;

public class KthLargestElement {

    // Approach 1: Selection Sort
    public static int kthLargestBySorting(int[] nums, int k) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums[n - k];
    }

    // Approach 2: Quick Select
    public static int kthLargestByQuickSelect(int[] nums, int k) {

        int targetIndex = nums.length - k;

        return quickSelect(nums, 0, nums.length - 1, targetIndex);
    }

    public static int quickSelect(
            int[] nums,
            int left,
            int right,
            int k) {

        int pivotIndex = partition(nums, left, right);

        if (pivotIndex == k) {
            return nums[pivotIndex];
        }

        if (pivotIndex < k) {
            return quickSelect(nums, pivotIndex + 1, right, k);
        }

        return quickSelect(nums, left, pivotIndex - 1, k);
    }

    public static int partition(
            int[] nums,
            int left,
            int right) {

        int pivot = nums[right];
        int i = left;

        for (int j = left; j < right; j++) {

            if (nums[j] <= pivot) {

                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, right);

        return i;
    }

    public static void swap(
            int[] nums,
            int i,
            int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
            arr2[i] = nums[i];
        }

        System.out.println(
                "Selection Sort: "
                        + kthLargestBySorting(arr1, k));

        System.out.println(
                "Quick Select: "
                        + kthLargestByQuickSelect(arr2, k));

        sc.close();
    }
}
