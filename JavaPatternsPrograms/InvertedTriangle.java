# InvertedTrianglePattern.java

```java
/*
Problem:
Print an inverted right triangle pattern of stars.

Example:
* * * * *
* * * *
* * *
* *
*

Approach:
1. The outer loop controls the number of rows.
2. The inner loop prints stars from n to 1.
3. After printing each row, move to the next line.

Time Complexity : O(n²)
Space Complexity : O(1)
*/

public class InvertedTrianglePattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```
