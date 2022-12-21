public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        String nome = "Davi";
        String nome2 = "Dayane";
        String nome3 = "Denise";
        pilha.adicionar(nome);
        pilha.adicionar(nome2);
        pilha.adicionar(nome3);
        //pilha.removerInicio();
        //pilha.removerInicio();
        //pilha.removerInicio();
        pilha.removerFinal();
        pilha.adicionar("Luciene");
        //System.out.println(pilha.get(2).getElemento());
        //System.out.println(pilha.toString());
        System.out.println(pilha.toString());
        System.out.println(pilha.getTamanho());
    }
    
}
