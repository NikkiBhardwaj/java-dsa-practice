# RightTrianglePattern.java

```java
/*
Problem:
Print a right triangle pattern of stars.

Example:
*
* *
* * *
* * * *
* * * * *

Approach:
1. The outer loop controls the number of rows.
2. The inner loop prints stars equal to the current row number.
3. After printing each row, move to the next line.

Time Complexity : O(n²)
Space Complexity : O(1)
*/

public class RightTrianglePattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```
