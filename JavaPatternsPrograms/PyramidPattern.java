# PyramidPattern.java

```java
/*
Problem:
Print a star pyramid pattern.

Example:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

Approach:
1. The first inner loop prints the required spaces.
2. The second inner loop prints the stars.
3. For every row, spaces decrease and stars increase.

Time Complexity : O(n²)
Space Complexity : O(1)
*/

public class PyramidPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print Spaces
            for (int space = 1; space <= n - row; space++) {

                System.out.print("  ");
            }

            // Print Stars
            for (int star = 1; star <= (2 * row) - 1; star++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```
