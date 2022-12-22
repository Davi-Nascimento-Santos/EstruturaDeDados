package PilhaDuplamenteEncadeada;
public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        String nome = "Davi";
        String nome2 = "Dayane";
        String nome3 = "Denise";
        String nome4 = "Luciene";
        String nome5 = "Rogerio";
        pilha.adicionarFim(nome);
        pilha.adicionarFim(nome2);
        pilha.adicionarFim(nome3);
        pilha.adicionarFim(nome4);
        pilha.adicionarFim(nome5);
        //pilha.removerFim();
        ///pilha.remover("Luciene");
        pilha.adicionar("João", "Denise");
        System.out.println(pilha.toString());
        System.out.println(pilha.getTamanho());
    }
    
}
