package demo.day_3.data_structures.hashmap;

public class MyHashMapController {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap();

        map.put("ryan", "555-123-45678");
        map.put("kim", "555-987-2341");
        map.put("evina", "555-987-3454");

        System.out.println(map.get("ryan"));
        System.out.println(map.get("kim"));
        System.out.println(map.get("evina"));

        // O(1) - best case
        // O(n) - worst case
        // avoid too many collisions by properly resizing underlying
        // array as it fills up
    }
}
