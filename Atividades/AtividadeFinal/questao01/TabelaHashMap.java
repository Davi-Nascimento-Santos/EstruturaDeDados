import java.util.HashMap;
public class TabelaHashMap<K, V> {
    private final HashMap<K, V> table;

    public TabelaHashMap() {
        table = new HashMap<K, V>();
    }
    public void put(K key, V value) {
        table.put(key, value);
    }
    public void pop(K key){
        table.remove(key);
    }

    public V get(K key) {
        // Search for the entry with the same key
        return table.get(key);
    }
}
