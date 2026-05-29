public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // Traverse from second element
        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int j = i - 1;

            // Shift larger elements to right
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Insert current element
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 6, 1, 3};

        insertionSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
