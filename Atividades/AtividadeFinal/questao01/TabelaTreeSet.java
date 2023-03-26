import java.util.TreeSet;

public class TabelaTreeSet {
    class Node implements Comparable<Node>{
        String Key;
        Integer Value;
        public Node(String key, Integer value){
            this.Key = key;
            this.Value = value;
        }
        public Node(){
            this.Key = null;
            this.Value = null;
        }
        public Node(String key){
            this.Key = key;
        }
        public String getKey() {
            return Key;
        }
        public void setKey(String key) {
            Key = key;
        }
        public Integer getValue() {
            return Value;
        }
        public void setValue(Integer value) {
            Value = value;
        }
        @Override
        public int compareTo(Node n){
            return this.Key.compareTo(n.getKey());
        }
        
    }
    private TreeSet<Node> simbolos;

    public TabelaTreeSet() {
        simbolos = new TreeSet<Node>();
    }

    public void add(String chave, Integer valor) {
        Node no = new Node(chave, valor);
        for (Node t: simbolos){
            if (t.getKey().equals(chave)){
                t.setValue(valor);
                return;
            }
        }
        simbolos.add(no);
    }

    public boolean get(String chave) {
        for (Node t: simbolos){
            if (t.getKey().equals(chave)){
                return true;
            }
        }
        return false;
    }

    public void pop(String chave) {
        for (Node t: simbolos){
            if (t.getKey().equals(chave)){
                simbolos.remove(t);
                break;
            }
        }
    }
}

/*import java.util.TreeSet;
public class TabelaTreeSet<K, V> {
    private final TreeSet<Entry<K, V>> table;

    public TabelaTreeSet() {
        table = new TreeSet<Entry<K, V>>();
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
    /*public void pop(K key){
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
}*/