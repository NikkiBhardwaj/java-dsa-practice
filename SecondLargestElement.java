// Find Second Largest Element in Array

public class SecondLargestElement {

    // -----------------------------------
    // Approach 1: Using Two Traversals
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static int secondLargestTwoPass(int[] arr) {

        int n = arr.length;

        int largest = -1;
        int secondLargest = -1;

        // Find largest element
        for(int i = 0; i < n; i++) {

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find second largest
        for(int i = 0; i < n; i++) {

            if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // -----------------------------------
    // Approach 2: One Traversal Optimized
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static int secondLargestOnePass(int[] arr) {

        int n = arr.length;

        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < n; i++) {

            if(arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] < largest &&
                    arr[i] > secondLargest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(
            "Two Traversal Approach: "
            + secondLargestTwoPass(arr)
        );

        System.out.println(
            "One Traversal Optimized Approach: "
            + secondLargestOnePass(arr)
        );
    }
}
