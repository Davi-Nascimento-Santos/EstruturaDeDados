public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa anterior;
    private Pessoa proximo; 
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Pessoa getAnterior() {
        return anterior;
    }
    public void setAnterior(Pessoa anterior) {
        this.anterior = anterior;
    }
    public Pessoa getProximo() {
        return proximo;
    }
    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }
    
}
