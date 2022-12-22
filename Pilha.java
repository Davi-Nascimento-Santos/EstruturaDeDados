package PilhaDuplamenteEncadeada;

public class Pilha{
    private Elemento inicio;
    private Elemento fim;
    private int tamanho;
    
    public Pilha() {
        this.inicio = null;
        this.fim = null;
        this.tamanho=0; 
    }
    public void adicionarFim(Object valor){
        Elemento aux = this.inicio;
        Elemento ele = new Elemento(valor);
        if(this.inicio == null){
            ele.setProximo(null);
            ele.setAnterior(null);
            this.inicio = ele;
            this.fim = ele;
            this.tamanho++;
        }else{
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            ele.setAnterior(aux);
            aux.setProximo(ele);
            ele.setProximo(null);
            this.fim = ele;
            this.tamanho++;
        }
    }
    public void adicionarInicio(Object valor){
        Elemento ele = new Elemento(valor);
        Elemento aux = this.inicio;
        ele.setAnterior(null);
        ele.setProximo(aux);
        this.inicio.setAnterior(ele);
        this.inicio = ele;
        this.tamanho++;
    }
    public void adicionar(Object valor, Object elemento){
        Elemento ele = new Elemento(valor);
        Elemento atual = this.inicio;
        if(this.inicio.getElemento().equals(elemento)){
            atual.setAnterior(ele);
            ele.setProximo(atual);
            ele.setAnterior(null);
            this.inicio=ele;
            this.tamanho++;
        }else if(this.fim.getElemento().equals(elemento)){
            Elemento fina = this.fim;
            Elemento anterior = fina.getAnterior();
            anterior.setProximo(ele);
            ele.setAnterior(anterior);
            ele.setProximo(fina);
            fina.setAnterior(ele);
            this.tamanho++;
        }else{
            while (!(atual.getElemento().equals(elemento))){
                    atual = atual.getProximo();
            }
            Elemento anterior = atual.getAnterior();
            ele.setAnterior(anterior);
            anterior.setProximo(ele);
            ele.setProximo(atual);
            atual.setAnterior(ele);
            this.tamanho++; 
        }
    }
    private void removerFim(){
        Elemento aux = this.fim.getAnterior();
        Elemento ult = this.fim;
        ult.setAnterior(null);
        ult = null;
        aux.setProximo(null);
        this.fim = aux;
        this.tamanho--;
    }
    private void removerInicio(){
        Elemento aux = this.inicio;
        Elemento proximo = this.inicio.getProximo();
        aux.setProximo(null);
        proximo.setAnterior(null);
        aux = null;
        this.inicio=proximo;
        this.tamanho--;
    }
    public void remover(Object valor){
        Elemento ele = new Elemento(valor);
        if(this.inicio.getElemento().equals(ele.getElemento())){
            removerInicio();
        }else if(this.fim.getElemento().equals(ele.getElemento())){
            removerFim();
        }else{
            Elemento atual = this.inicio;
            while(!(ele.getElemento().equals(atual.getElemento()))){
                atual = atual.getProximo();
            }
            Elemento anterior = atual.getAnterior();
            Elemento proximo = atual.getProximo();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            atual = null;
            this.tamanho--;
        }
    }
    public int getTamanho(){
        return this.tamanho;
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
    @Override
    public String toString() {
        String show = "";
        Elemento aux = this.inicio;
        while(aux != null){
            show += aux.getElemento();
            show += ", ";
            aux = aux.getProximo();
        }
        return show;
    
    }
}