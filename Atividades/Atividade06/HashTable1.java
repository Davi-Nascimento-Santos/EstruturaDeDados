
public class HashTable1<Key, Value> {
    int n;
    Node<Key, Value>[] tab;

    public HashTable1(int n){
        this.n = n;
        tab = (Node<Key, Value>[]) new Node[n];
        for(int i = 0;i < n; i++){
            tab[i] = null;
        }
    }

    public int hash(Key key){
        String qualquer = (String) key;
        return qualquer.charAt(0) - 65;
    }

    public boolean contains(Key key){
        return get(key) != null;
    }

    public Value get(Key key){
        int i = hash(key);
        Node<Key, Value> aux = tab[i];
        while(aux != null){
            if(key.equals(aux.chave))
                break;
        }
        if(aux != null){
            return aux.valor;
        }else
            return null;
    }

    public void put(Key key, Value valor){
        int i = hash(key);
        Node<Key, Value> novo = new Node<>();
        novo.chave = key;
        novo.valor = valor;
        if(tab[i] == null)
            novo.prox = null;
        else
            novo.prox = tab[i];
        tab[i] = novo;
    }

    public void imprimir(){
        int maior = 0;
        int menor = 1000000;
        int[] cont = new int[26];
        double all = 0;
        for(int i = 0;i < 26; i++){
            Node<Key, Value> aux = tab[i];
            while(aux != null){
               //System.out.println(aux.chave + ", " + aux.valor);
               aux = aux.prox;
               cont[i]++;
            }
            all += cont[i];
            if(cont[i] > maior)
                maior = cont[i];
            if (cont[i] < menor)
                menor = cont[i];

            System.out.println("Quantidade de elementos no array " + i + ": " + cont[i]);
        }
        double media = all / this.n;
        System.out.println("\nO array que tem mais elementos é a letra L e tem: " + maior);
        System.out.println("Os arrays que tem menos elementos são as letras Q e X e tem: " + menor);
        System.out.println("Média: " + media);
        double first = 0;
        for (int i=0; i< this.n; i++){
            first += (cont[i] - media) * (cont[i] - media);
        }
        first = Math.sqrt((first / this.n));
        System.out.println("Desvio padrão: " + first);
    }
}
