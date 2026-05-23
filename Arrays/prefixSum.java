// Prefix Sum in Array

public class PrefixSum {

    // -----------------------------------
    // Approach 1: Brute Force Prefix Sum
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] prefixSumBruteForce(
            int[] arr
    ) {

        int n = arr.length;

        int[] prefix = new int[n];

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = 0; j <= i; j++) {

                sum += arr[j];
            }

            prefix[i] = sum;
        }

        return prefix;
    }

    // -----------------------------------
    // Approach 2: Optimized Prefix Sum
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] prefixSumOptimized(
            int[] arr
    ) {

        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++) {

            prefix[i] =
                    prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // Function to print array
    static void printArray(int[] arr) {

        for(int num : arr) {

            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(
            "Brute Force Prefix Sum:"
        );

        printArray(
            prefixSumBruteForce(arr)
        );

        System.out.println(
            "Optimized Prefix Sum:"
        );

        printArray(
            prefixSumOptimized(arr)
        );
    }
}
