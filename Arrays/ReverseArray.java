// Reverse Array Problem

public class ReverseArray {

    // -----------------------------------
    // Approach 1: Using Temporary Array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static void reverseUsingTemp(int[] arr) {

        int n = arr.length;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Approach 1: Using Temporary Array");

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");
    }

    // -----------------------------------
    // Approach 2: Two Pointer While Loop
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void reverseUsingTwoPointers(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Approach 2: Two Pointer While Loop");

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");
    }

    // -----------------------------------
    // Approach 3: Swapping Using For Loop
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void reverseUsingForLoop(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("Approach 3: Swapping Using For Loop");

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 3, 2, 6, 5};
        int[] arr2 = {1, 4, 3, 2, 6, 5};
        int[] arr3 = {1, 4, 3, 2, 6, 5};

        reverseUsingTemp(arr1);

        reverseUsingTwoPointers(arr2);

        reverseUsingForLoop(arr3);
    }
}
