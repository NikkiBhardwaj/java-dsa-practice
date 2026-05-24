// Rotate Array By K Positions

public class RotateArrayByK {

    // -----------------------------------
    // Approach 1: Brute Force
    // Rotate one by one K times
    // Time Complexity: O(n * k)
    // Space Complexity: O(1)
    // -----------------------------------

    static void rotateByKBruteForce(
            int[] arr,
            int k
    ) {

        int n = arr.length;

        k = k % n;

        for(int i = 0; i < k; i++) {

            int last = arr[n - 1];

            for(int j = n - 1; j > 0; j--) {

                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }
    }

    // -----------------------------------
    // Approach 2: Using Extra Array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] rotateByKExtraArray(
            int[] arr,
            int k
    ) {

        int n = arr.length;

        k = k % n;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {

            temp[(i + k) % n] = arr[i];
        }

        return temp;
    }

    // -----------------------------------
    // Approach 3: Reversal Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void reverse(
            int[] arr,
            int start,
            int end
    ) {

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rotateByKOptimized(
            int[] arr,
            int k
    ) {

        int n = arr.length;

        k = k % n;

        // Reverse complete array
        reverse(arr, 0, n - 1);

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    // Function to print array
    static void printArray(int[] arr) {

        for(int num : arr) {

            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] arr2 = {1, 2, 3, 4, 5};

        int[] arr3 = {1, 2, 3, 4, 5};

        int k = 2;

        System.out.println(
            "Rotate By K Brute Force:"
        );

        rotateByKBruteForce(arr1, k);

        printArray(arr1);

        System.out.println(
            "Rotate By K Using Extra Array:"
        );

        printArray(
            rotateByKExtraArray(arr2, k)
        );

        System.out.println(
            "Rotate By K Optimized:"
        );

        rotateByKOptimized(arr3, k);

        printArray(arr3);
    }
}
