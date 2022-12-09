package listaligada;

public class Node<Tipo> {
	
	private Tipo elemento;
	private Node<Tipo> anterior;
	private Node<Tipo> proximo;
	
	
	//Construtores
	public Node(Tipo elemento) {
		this.elemento = elemento;
		this.anterior = null;
		this.proximo = null;
		
	}
	
	
	//Getters e setters
	public Tipo getElemento() {
		return elemento;
	}
	public void setElemento(Tipo elemento) {
		this.elemento = elemento;
	}
	public Node<Tipo> getProximo() {
		return proximo;
	}
	public void setProximo(Node<Tipo> proximo) {
		this.proximo = proximo;
	}
	
	public Node<Tipo> getAnterior() {
		return anterior;
	}

	public void setAnterior(Node<Tipo> anterior) {
		this.anterior = anterior;
	}

}
