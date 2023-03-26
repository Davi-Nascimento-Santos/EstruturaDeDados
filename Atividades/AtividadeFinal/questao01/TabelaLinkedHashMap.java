import java.util.LinkedHashMap;
public class TabelaLinkedHashMap<K, V> {
    private final LinkedHashMap<K, V> table;

    public TabelaLinkedHashMap() {
        table = new LinkedHashMap<K, V>();
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
