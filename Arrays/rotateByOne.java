// Rotate Array By One Position

public class RotateArrayByOne {

    // -----------------------------------
    // Approach 1: Using Extra Array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int[] rotateByOneExtraArray(
            int[] arr
    ) {

        int n = arr.length;

        int[] temp = new int[n];

        temp[0] = arr[n - 1];

        for(int i = 0; i < n - 1; i++) {

            temp[i + 1] = arr[i];
        }

        return temp;
    }

    // -----------------------------------
    // Approach 2: In-Place Rotation
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------

    static void rotateByOneInPlace(
            int[] arr
    ) {

        int n = arr.length;

        int last = arr[n - 1];

        for(int i = n - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }

        arr[0] = last;
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

        System.out.println(
            "Rotate By One Using Extra Array:"
        );

        printArray(
            rotateByOneExtraArray(arr1)
        );

        System.out.println(
            "Rotate By One In Place:"
        );

        rotateByOneInPlace(arr2);

        printArray(arr2);
    }
}
