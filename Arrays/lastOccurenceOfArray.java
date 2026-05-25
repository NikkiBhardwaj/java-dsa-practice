// Find Last Occurrence of an Element in Array

public class LastOccurrenceInArray {

    // -----------------------------------
    // Approach 1: Brute Force
    // Traverse complete array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static int lastOccurrenceBruteForce(
            int[] arr,
            int target
    ) {

        int lastIndex = -1;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {

                lastIndex = i;
            }
        }

        return lastIndex;
    }

    // -----------------------------------
    // Approach 2: Reverse Traversal
    // Start from end
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static int lastOccurrenceReverse(
            int[] arr,
            int target
    ) {

        for(int i = arr.length - 1;
            i >= 0;
            i--) {

            if(arr[i] == target) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr =
                {1, 2, 3, 2, 4, 2, 5};

        int target = 2;

        System.out.println(
            "Brute Force Approach: "
            + lastOccurrenceBruteForce(
                    arr,
                    target
              )
        );

        System.out.println(
            "Reverse Traversal Approach: "
            + lastOccurrenceReverse(
                    arr,
                    target
              )
        );
    }
}
