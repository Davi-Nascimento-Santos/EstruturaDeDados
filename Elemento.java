package PilhaDuplamenteEncadeada;

public class Elemento {
    private Object elemento;
    private Elemento anterior;
    private Elemento proximo;
    
    public Elemento(Object elemento) {
        this.elemento = elemento;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    public Elemento getAnterior() {
        return anterior;
    }
    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }
    public Elemento getProximo() {
        return proximo;
    }
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
