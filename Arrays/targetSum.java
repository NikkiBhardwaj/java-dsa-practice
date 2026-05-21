// Target Sum Problem
// Find if there exists a pair
// whose sum is equal to target

import java.util.Arrays;
import java.util.HashSet;

public class TargetSum {

    // -----------------------------------
    // Approach 1: Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------

    static boolean targetSumBruteForce(
            int[] arr,
            int target
    ) {

        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {

                    System.out.println(
                        "Pair: "
                        + arr[i] + " "
                        + arr[j]
                    );

                    return true;
                }
            }
        }

        return false;
    }

    // -----------------------------------
    // Approach 2: Using HashSet
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static boolean targetSumHashSet(
            int[] arr,
            int target
    ) {

        HashSet<Integer> set =
                new HashSet<>();

        for(int i = 0; i < arr.length; i++) {

            int complement =
                    target - arr[i];

            if(set.contains(complement)) {

                System.out.println(
                    "Pair: "
                    + arr[i] + " "
                    + complement
                );

                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }

    // -----------------------------------
    // Approach 3: Two Pointer Optimized
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    // -----------------------------------

    static boolean targetSumOptimized(
            int[] arr,
            int target
    ) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int sum =
                    arr[left] + arr[right];

            if(sum == target) {

                System.out.println(
                    "Pair: "
                    + arr[left] + " "
                    + arr[right]
                );

                return true;
            }

            else if(sum < target) {

                left++;
            }

            else {

                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        System.out.println(
            "Brute Force Approach: "
            + targetSumBruteForce(arr, target)
        );

        System.out.println(
            "HashSet Approach: "
            + targetSumHashSet(arr, target)
        );

        System.out.println(
            "Optimized Two Pointer Approach: "
            + targetSumOptimized(arr, target)
        );
    }
}
