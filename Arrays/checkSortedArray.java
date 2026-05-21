// Check if Array is Sorted or Not

public class CheckSortedArray {

    // -----------------------------------
    // Approach 1: Brute Force
    // Compare every element with next elements
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------

    static boolean isSortedBruteForce(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]) {

                    return false;
                }
            }
        }

        return true;
    }

    // -----------------------------------
    // Approach 2: Optimized One Traversal
    // Compare adjacent elements
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static boolean isSortedOptimized(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        boolean bruteResult =
                isSortedBruteForce(arr);

        boolean optimizedResult =
                isSortedOptimized(arr);

        System.out.println(
            "Brute Force Approach: "
            + bruteResult
        );

        System.out.println(
            "Optimized Approach: "
            + optimizedResult
        );
    }
}
