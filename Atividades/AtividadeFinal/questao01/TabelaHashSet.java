import java.util.HashSet;

public class TabelaHashSet<K, V> {
    HashSet<Entry<K, V>> table;
    public TabelaHashSet(){
        table = new HashSet<Entry<K, V>>();
    }
    public void put(K key, V value) {
        // Search for the entry with the same key
        for (Entry<K, V> entry : table) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        // If the key is not found, add a new entry
        table.add(new Entry<K, V>(key, value));
    }
    public void pop(K key){
        for (Entry<K, V> entry : table) {
            if (entry.getKey().equals(key)) {
                table.remove(entry);
                break;
            }
        }
    }
    public V get(K key) {
        // Search for the entry with the same key
        for (Entry<K, V> entry : table) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        // If the key is not found, return null
        return null;
    }
}
