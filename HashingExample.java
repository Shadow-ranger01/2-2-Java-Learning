import java.util.*;

public class HashingExample {
    public static void main(String[] args) {
        // 1. HashMap: Map names to scores
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 91);

        System.out.println("Alice's Score: " + scores.get("Alice")); // O(1)

        // 2. HashSet: Store unique student IDs
        HashSet<Integer> studentIds = new HashSet<>();
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(101); // Duplicate! Will be ignored.

        System.out.println("Total Unique IDs: " + studentIds.size()); // Output: 2
        System.out.println("Has ID 105? " + studentIds.contains(105)); // O(1)
    }
}
