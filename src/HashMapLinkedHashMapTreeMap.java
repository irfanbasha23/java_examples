import java.util.HashMap;

public class HashMapLinkedHashMapTreeMap {

    /**
     * Summary of Differences
     * Order:
     *
     * HashMap: No guaranteed order.
     * LinkedHashMap: Maintains insertion order or access order.
     * TreeMap: Maintains sorted order.
     *
     * Performance:
     *
     * HashMap: Average constant-time performance (O(1)) for basic operations.
     * LinkedHashMap: Slightly lower performance than HashMap due to the linked list overhead.
     * TreeMap: Logarithmic time performance (O(log n)) for basic operations.
     * Null Handling:
     *
     * HashMap and LinkedHashMap: Allow one null key and multiple null values.
     * TreeMap: Does not allow null keys but allows multiple null values.
     * Use Cases:
     *
     * HashMap: Suitable for quick lookups without concern for order.
     * LinkedHashMap: Suitable when order preservation is important, such as in caches (access order).
     * TreeMap: Suitable when natural ordering of keys is required, such as in sorted maps or range queries.
     * @param args
     */
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","1");
        hashMap.put("2","2");


    }
}
