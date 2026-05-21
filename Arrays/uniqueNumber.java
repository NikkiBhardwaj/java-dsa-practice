
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumber {

    // -----------------------------------
    // Approach 1: Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------

    static int uniqueBruteForce(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            int count = 0;

            for(int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    count++;
                }
            }

            if(count == 1) {

                return arr[i];
            }
        }

        return -1;
    }

    // -----------------------------------
    // Approach 2: Using HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int uniqueUsingHashMap(int[] arr) {

        HashMap<Integer, Integer> map =
                new HashMap<>();

        for(int num : arr) {

            map.put(
                num,
                map.getOrDefault(num, 0) + 1
            );
        }

        for(int num : arr) {

            if(map.get(num) == 1) {

                return num;
            }
        }

        return -1;
    }

    // -----------------------------------
    // Approach 3: Using HashSet
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------

    static int uniqueUsingHashSet(int[] arr) {

        HashSet<Integer> set =
                new HashSet<>();

        int sumOfSet = 0;
        int sumOfArray = 0;

        for(int num : arr) {

            if(!set.contains(num)) {

                set.add(num);
                sumOfSet += num;
            }

            sumOfArray += num;
        }

        return (2 * sumOfSet) - sumOfArray;
    }
   public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        System.out.println(
            "Brute Force Approach: "
            + uniqueBruteForce(arr)
        );

        System.out.println(
            "HashMap Approach: "
            + uniqueUsingHashMap(arr)
        );

        System.out.println(
            "HashSet Approach: "
            + uniqueUsingHashSet(arr)
        );
    }
}
