# SquarePattern.java

```java
/*
Problem:
Print a square pattern of stars.

Example:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Approach:
1. The outer loop is used to print the rows.
2. The inner loop is used to print the columns.
3. In every row, '*' is printed n times.

Time Complexity : O(n²)
Space Complexity : O(1)
*/

public class SquarePattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```
