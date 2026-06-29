```java
import java.util.Scanner;

public class PerfectNumberUsingRecursion {

    /*
     * Recursive function to calculate the sum of proper divisors.
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n)
     */

    static int rec(int i, int n, int sum) {

        // Base Case
        if (i > n / 2) {
            return sum;
        }

        // If i is a divisor of n
        if (n % i == 0) {
            sum += i;
        }

        // Recursive Call
        return rec(i + 1, n, sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = rec(1, num, 0);

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }

        sc.close();
    }
}

/*
------------------------------------
Input:
6

Output:
6 is a Perfect Number.

------------------------------------
Input:
28

Output:
28 is a Perfect Number.

------------------------------------
Time Complexity:
O(n)

Reason:
The recursion checks every number from 1 to n/2.

------------------------------------
Space Complexity:
O(n)

Reason:
The recursion stack stores one call for each value of i.
------------------------------------
*/
```
