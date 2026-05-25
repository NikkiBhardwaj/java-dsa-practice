// Count Number of Occurrences in Array

import java.util.HashMap;

public class CountOccurrences {

    // -----------------------------------
    // Approach 1: Brute Force
    // Count occurrences using nested loops
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------

    static int countOccurrencesBruteForce(
            int[] arr,
            int target
    ) {

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {

                count++;
            }
        }

        return count;
    }

    // -----------------------------------
    // Approach 2: Using HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int countOccurrencesHashMap(
            int[] arr,
            int target
    ) {

        HashMap<Integer, Integer> map =
                new HashMap<>();

        for(int num : arr) {

            map.put(
                num,
                map.getOrDefault(num, 0) + 1
            );
        }

        return map.getOrDefault(target, 0);
    }

    // -----------------------------------
    // Approach 3: Using Frequency Array
    // Works for small positive integers
    // Time Complexity: O(n)
    // Space Complexity: O(maxElement)
    // -----------------------------------

    static int countOccurrencesFrequency(
            int[] arr,
            int target
    ) {

        int max = 0;

        for(int num : arr) {

            if(num > max) {

                max = num;
            }
        }

        int[] freq = new int[max + 1];

        for(int num : arr) {

            freq[num]++;
        }

        return freq[target];
    }

    public static void main(String[] args) {

        int[] arr =
                {1, 2, 3, 2, 4, 2, 5};

        int target = 2;

        System.out.println(
            "Brute Force Approach: "
            + countOccurrencesBruteForce(
                    arr,
                    target
              )
        );

        System.out.println(
            "HashMap Approach: "
            + countOccurrencesHashMap(
                    arr,
                    target
              )
        );

        System.out.println(
            "Frequency Array Approach: "
            + countOccurrencesFrequency(
                    arr,
                    target
              )
        );
    }
}
