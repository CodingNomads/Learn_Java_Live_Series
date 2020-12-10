package demo.day_3.data_structures.hashmap;

public class HashMapNode<K, V> {
    K key;
    V value;
    HashMapNode<K, V> next;

    public HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
