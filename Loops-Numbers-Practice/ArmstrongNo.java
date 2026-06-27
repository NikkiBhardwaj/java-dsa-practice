```java
import java.util.Scanner;

public class ArmstrongNumberUsingRecursion {

    /*
     * Recursive function to calculate the Armstrong sum.
     *
     * Time Complexity  : O(d)
     * Space Complexity : O(d)
     *
     * where d = number of digits in the given number.
     */

    static int rec(int n, int sum, int digits) {

        // Base Case
        if (n <= 0) {
            return sum;
        }

        // Extract the last digit
        int d = n % 10;

        // Recursive Call
        return rec(n / 10, sum + (int) Math.pow(d, digits), digits);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Count the number of digits
        int digits = String.valueOf(num).length();

        // Special case for 0
        if (num == 0) {
            digits = 1;
        }

        int result = rec(num, 0, digits);

        if (result == num) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }

        sc.close();
    }
}

/*
------------------------------------
Input:
153

Output:
153 is an Armstrong Number.

------------------------------------
Time Complexity:
O(d)

Reason:
The recursive function processes one digit in each call.
If the number has d digits, there will be d recursive calls.

------------------------------------
Space Complexity:
O(d)

Reason:
The recursion stack stores one function call for each digit.
Hence, recursion uses O(d) stack space.
------------------------------------
*/
```
