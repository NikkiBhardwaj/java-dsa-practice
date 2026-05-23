// Suffix Sum in Array

public class SuffixSum {

    // -----------------------------------
    // Approach 1: Brute Force Suffix Sum
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] suffixSumBruteForce(
            int[] arr
    ) {

        int n = arr.length;

        int[] suffix = new int[n];

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {

                sum += arr[j];
            }

            suffix[i] = sum;
        }

        return suffix;
    }

    // -----------------------------------
    // Approach 2: Optimized Suffix Sum
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] suffixSumOptimized(
            int[] arr
    ) {

        int n = arr.length;

        int[] suffix = new int[n];

        suffix[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {

            suffix[i] =
                    suffix[i + 1] + arr[i];
        }

        return suffix;
    }

    // -----------------------------------
    // Approach 3: Using Sum Function
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // -----------------------------------

    static int getSum(
            int[] arr,
            int start,
            int end
    ) {

        int sum = 0;

        for(int i = start; i <= end; i++) {

            sum += arr[i];
        }

        return sum;
    }

    static int[] suffixUsingSumFunction(
            int[] arr
    ) {

        int n = arr.length;

        int[] suffix = new int[n];

        for(int i = 0; i < n; i++) {

            suffix[i] =
                    getSum(arr, i, n - 1);
        }

        return suffix;
    }

    // -----------------------------------
    // Approach 4: Using Prefix Sum
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] prefixSum(int[] arr) {

        int[] prefix =
                new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {

            prefix[i] =
                    prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    static int[] suffixUsingPrefixSum(
            int[] arr
    ) {

        int n = arr.length;

        int[] prefix = prefixSum(arr);

        int[] suffix = new int[n];

        int totalSum = prefix[n - 1];

        for(int i = 0; i < n; i++) {

            if(i == 0) {

                suffix[i] = totalSum;
            }

            else {

                suffix[i] =
                        totalSum - prefix[i - 1];
            }
        }

        return suffix;
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
            "Brute Force Suffix Sum:"
        );

        printArray(
            suffixSumBruteForce(arr)
        );

        System.out.println(
            "Optimized Suffix Sum:"
        );

        printArray(
            suffixSumOptimized(arr)
        );

        System.out.println(
            "Suffix Sum Using Sum Function:"
        );

        printArray(
            suffixUsingSumFunction(arr)
        );

        System.out.println(
            "Suffix Sum Using Prefix Sum:"
        );

        printArray(
            suffixUsingPrefixSum(arr)
        );
    }
}
