```java
import java.util.Scanner;

public class NormOfNumberUsingRecursion {

    /*
     * Recursive function to calculate the Norm of a Number
     * (Sum of squares of digits)
     *
     * Time Complexity  : O(d)
     * Space Complexity : O(d)
     */

    static int rec(int n, int sum) {

        // Base Case
        if (n <= 0) {
            return sum;
        }

        // Extract last digit
        int d = n % 10;

        // Recursive Call
        return rec(n / 10, sum + (d * d));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int norm = rec(num, 0);

        System.out.println("Norm of " + num + " = " + norm);

        sc.close();
    }
}

/*
------------------------------------
Input:
123

Output:
Norm of 123 = 14

------------------------------------
Time Complexity:
O(d)

Space Complexity:
O(d)
------------------------------------
*/
```
