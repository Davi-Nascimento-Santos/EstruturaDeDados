public class Elemento {
    private Object elemento;
    private Elemento proximo;
    
    public Elemento(Object valor) {
        this.elemento = valor;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    public Elemento getProximo() {
        return proximo;
    }
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    
    
}
