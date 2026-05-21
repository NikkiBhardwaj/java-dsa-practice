// Triplet Sum Problem
// Find if there exists a triplet
// whose sum is equal to target

import java.util.Arrays;
import java.util.HashSet;

public class TripletSum {

    // -----------------------------------
    // Approach 1: Brute Force
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    // -----------------------------------

    static boolean tripletSumBruteForce(
            int[] arr,
            int target
    ) {

        int n = arr.length;

        for(int i = 0; i < n - 2; i++) {

            for(int j = i + 1; j < n - 1; j++) {

                for(int k = j + 1; k < n; k++) {

                    if(arr[i] + arr[j] + arr[k]
                            == target) {

                        System.out.println(
                            "Triplet: "
                            + arr[i] + " "
                            + arr[j] + " "
                            + arr[k]
                        );

                        return true;
                    }
                }
            }
        }

        return false;
    }

    // -----------------------------------
    // Approach 2: Using HashSet
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // -----------------------------------

    static boolean tripletSumHashSet(
            int[] arr,
            int target
    ) {

        int n = arr.length;

        for(int i = 0; i < n - 2; i++) {

            HashSet<Integer> set =
                    new HashSet<>();

            for(int j = i + 1; j < n; j++) {

                int third =
                        target - arr[i] - arr[j];

                if(set.contains(third)) {

                    System.out.println(
                        "Triplet: "
                        + arr[i] + " "
                        + arr[j] + " "
                        + third
                    );

                    return true;
                }

                set.add(arr[j]);
            }
        }

        return false;
    }

    // -----------------------------------
    // Approach 3: Two Pointer Optimized
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------

    static boolean tripletSumOptimized(
            int[] arr,
            int target
    ) {

        Arrays.sort(arr);

        int n = arr.length;

        for(int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while(left < right) {

                int sum =
                        arr[i]
                        + arr[left]
                        + arr[right];

                if(sum == target) {

                    System.out.println(
                        "Triplet: "
                        + arr[i] + " "
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
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, 8};

        int target = 22;

        System.out.println(
            "Brute Force Approach: "
            + tripletSumBruteForce(arr, target)
        );

        System.out.println(
            "HashSet Approach: "
            + tripletSumHashSet(arr, target)
        );

        System.out.println(
            "Optimized Two Pointer Approach: "
            + tripletSumOptimized(arr, target)
        );
    }
}
