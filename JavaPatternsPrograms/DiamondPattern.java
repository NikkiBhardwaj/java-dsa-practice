public class DiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            // Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
