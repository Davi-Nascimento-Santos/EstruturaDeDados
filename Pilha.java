import java.nio.file.attribute.AclEntryPermission;

public class Pilha{
    private Elemento inicio;
    private Elemento fim;
    private int tamanho;

    public Pilha() {
        this.tamanho = 0;
    }
    public void removerInicio(){
        if(this.tamanho>1){
            this.inicio = this.inicio.getProximo();
            this.tamanho--;
        }else if(this.tamanho==1){
            this.inicio=null;
            this.fim=null;
            this.tamanho--;
        }
    }
    public void removerFinal(){
        Elemento anterior = null;
        Elemento atual = this.inicio;
        if(this.tamanho > 1){
            for (int i=0; i<tamanho-1; i++){
                anterior = atual;
                atual = atual.getProximo();
            }
            anterior.setProximo(this.fim.getProximo());
            this.fim = anterior;
            this.tamanho--;
            atual = null; 
        }else if(this.tamanho==1){
            this.inicio = null;
            this.fim = null;
            this.tamanho--;
        }else{
            System.out.println("Não foi possivel remover!");
        }
    }
    public void remover(Object valor){
        Elemento anterior = null;
        Elemento atual = this.inicio;
        for (int i=0; i< this.tamanho; i++){
            if (atual.getElemento().equals(valor)){
                anterior.setProximo(atual.getProximo());
                atual = null;
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    public void adicionar(Object valor){
        Elemento elemento = new Elemento(valor);
        if (this.inicio == null && this.fim == null){
            this.inicio = elemento;
            this.fim = elemento;
            this.tamanho++;
        }else{
            this.fim.setProximo(elemento);
            this.fim = elemento;
            this.tamanho++;
        }
    }
    public Elemento get(int posicao){
        Elemento atual = this.inicio;
        for (int i=0; i< posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
    public int getElemento(Object valor){
        Elemento atual = this.inicio;
        for (int i=0; i<this.tamanho; i++){
            if (atual.getElemento().equals(valor)){
                return i;
            }
            atual = atual.getProximo();
        }    
        return -1;
    }
    public Elemento getInicio() {
        return inicio;
    }
    public void setInicio(Elemento inicio) {
        this.inicio = inicio;
    }
    public Elemento getFim() {
        return fim;
    }
    public void setFim(Elemento fim) {
        this.fim = fim;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String toString() {
        String show = "";
        Elemento atual = this.inicio;
        if(atual!=null){
            for (int i=1; i<=this.tamanho; i++){
                show += atual.getElemento();
                if (i<this.tamanho){
                    show += ", ";
                }else{
                    show += ".";
                }
                atual = atual.getProximo();
            }
        }
        return show;
    }
    
    
}