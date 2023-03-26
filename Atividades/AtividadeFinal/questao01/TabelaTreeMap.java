import java.util.TreeMap;
public class TabelaTreeMap<K, V> {
    private final TreeMap<K, V> table;

    public TabelaTreeMap() {
        table = new TreeMap<K, V>();
    }
    public void put(K key, V value) {
        table.put(key, value);
    }
    public void remove(K key){
        table.remove(key);
    }

    public V get(K key) {
        // Search for the entry with the same key
        return table.get(key);
    }
    
}
