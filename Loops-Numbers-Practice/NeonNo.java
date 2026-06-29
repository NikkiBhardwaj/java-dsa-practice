```java
import java.util.Scanner;

public class NeonNumberUsingRecursion {

    /*
     * Recursive function to calculate the sum of digits.
     *
     * Time Complexity  : O(d)
     * Space Complexity : O(d)
     */

    static int rec(int n, int sum) {

        // Base Case
        if (n <= 0) {
            return sum;
        }

        int d = n % 10;

        return rec(n / 10, sum + d);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        int result = rec(square, 0);

        if (result == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }

        sc.close();
    }
}

/*
Input:
9

Output:
9 is a Neon Number.

Time Complexity : O(d)
Space Complexity: O(d)
*/
```
