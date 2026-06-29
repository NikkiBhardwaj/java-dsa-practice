```java
import java.util.Scanner;

public class NivenNumberUsingRecursion {

    /*
     * Recursive function to calculate the sum of digits.
     *
     * Time Complexity  : O(d)
     * Space Complexity : O(d)
     */

    static int rec(int n, int sum) {

        // Base Case
        if (n == 0) {
            return sum;
        }

        int d = n % 10;

        return rec(n / 10, sum + d);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = rec(num, 0);

        if (sum != 0 && num % sum == 0) {
            System.out.println(num + " is a Niven Number.");
        } else {
            System.out.println(num + " is not a Niven Number.");
        }

        sc.close();
    }
}

/*
------------------------------------
Input:
18

Output:
18 is a Niven Number.

------------------------------------
Time Complexity:
O(d)

Reason:
The recursive function processes one digit in each recursive call.

------------------------------------
Space Complexity:
O(d)

Reason:
One recursive call is stored for each digit.
------------------------------------
*/
```
