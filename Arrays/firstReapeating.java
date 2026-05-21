// Find First Repeating Element in an Array

import java.util.HashSet;

public class FirstRepeatingElement {

    // -----------------------------------
    // Approach 1: Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------

    static int firstRepeatingBruteForce(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    return arr[i];
                }
            }
        }

        return -1;
    }

    // -----------------------------------
    // Approach 2: Using HashSet
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int firstRepeatingUsingHashSet(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        int repeatingElement = -1;

        // Traverse from right to left
        for(int i = arr.length - 1; i >= 0; i--) {

            if(set.contains(arr[i])) {

                repeatingElement = arr[i];
            }

            else {

                set.add(arr[i]);
            }
        }

        return repeatingElement;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int bruteResult =
                firstRepeatingBruteForce(arr);

        int optimizedResult =
                firstRepeatingUsingHashSet(arr);

        System.out.println(
            "Brute Force Approach: "
            + bruteResult
        );

        System.out.println(
            "Optimized HashSet Approach: "
            + optimizedResult
        );
    }
}
