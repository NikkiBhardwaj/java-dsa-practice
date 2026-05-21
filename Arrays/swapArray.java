// Swap Elements in an Array

public class SwapArrayElements {

    // -----------------------------------
    // Approach 1: Using Temporary Variable
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // -----------------------------------

    static void swapUsingTemp(
            int[] arr,
            int i,
            int j
    ) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(
            "After Swapping Using Temp Variable:"
        );

        printArray(arr);
    }

    // -----------------------------------
    // Approach 2: Without Temporary Variable
    // Using Addition and Subtraction
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // -----------------------------------

    static void swapWithoutTemp(
            int[] arr,
            int i,
            int j
    ) {

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];

        System.out.println(
            "After Swapping Without Temp Variable:"
        );

        printArray(arr);
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

        int i = 1;
        int j = 3;

        swapUsingTemp(arr1, i, j);

        swapWithoutTemp(arr2, i, j);
   }
}
