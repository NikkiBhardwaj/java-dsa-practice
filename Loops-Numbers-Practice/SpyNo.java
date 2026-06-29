```java
import java.util.Scanner;

public class SpyNo {

    /*
     * Recursive function to calculate the sum of digits.
     *
     * Time Complexity  : O(d)
     * Space Complexity : O(d)
     */

    static int sumRec(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumRec(n / 10);
    }

    /*
     * Recursive function to calculate the product of digits.
     *
     * Time Complexity  : O(d)
     * Space Complexity : O(d)
     */

    static int productRec(int n) {

        if (n == 0) {
            return 1;
        }

        return (n % 10) * productRec(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = sumRec(num);
        int product = productRec(num);

        if (sum == product) {
            System.out.println(num + " is a Spy Number.");
        } else {
            System.out.println(num + " is not a Spy Number.");
        }

        sc.close();
    }
}

/*
------------------------------------
Input:
1124

Output:
1124 is a Spy Number.

------------------------------------
Input:
123

Output:
123 is a Spy Number.

------------------------------------
Time Complexity:
O(d)

Reason:
Both recursive functions process each digit once.

Space Complexity:
O(d)

Reason:
Recursion stack stores one call per digit.
------------------------------------
*/
```
