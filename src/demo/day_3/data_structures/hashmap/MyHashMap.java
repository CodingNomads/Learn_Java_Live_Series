package demo.day_3.data_structures.hashmap;

public class MyHashMap<K, V> {

    private HashMapNode<K, V>[] data = new HashMapNode[10];

    // ADD DATA
    public void put(K key, V value){
        int index = getHash(key);

        if(data[index] == null){
            data[index] = new HashMapNode(key, value);
            return;
        }

        HashMapNode<K, V> iter = data[index];

        while(iter.next != null){
            iter = iter.next;
        }
        iter.next = new HashMapNode(key, value);

    }

    private int getHash(K key) {
        // Ryan -> 56455646767814 % 10 = 4
        // Kim > 4545434535434 % 10 = 4

        int index = Math.abs(key.hashCode() % data.length);
        return index;
    }

    // GET DATA
    public V get(K key){
        int index = getHash(key);

        if(data[index] == null){
            return null;
        }
        if (data[index].key.equals(key)){
            return data[index].value;
        }
        HashMapNode<K, V> iter = data[index];

        while(!iter.key.equals(key) && iter != null){
            iter = iter.next;
        }

        if(iter != null){
            return iter.value;
        } else {
            return null;
        }
    }

    // REMOVE DATA

}
