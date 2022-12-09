package listaligada;
/*
 * Lista duplamente encadeada com dois descritores
 */
import java.util.NoSuchElementException;

public class ListaEncadeada <Tipo> {
	
	private Node<Tipo> inicio;
	private Node<Tipo> fim;
	private int tamanho;
	
	public ListaEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public boolean estaVazia() {return this.tamanho == 0;}
	
	public int getTamanho() {return tamanho;}
	
	//adiciona novo nó no início da lista
	public void adicionaInicio(Tipo elemento) {
		if(estaVazia()) {
			Node<Tipo> node = new Node<>(elemento);
			this.inicio = node;
			this.fim = node;
			this.tamanho++;
		} else {
			if(estaNaLista(elemento)) {
				throw new IllegalArgumentException("Erro: o elemento já está na lista");
			}
			Node<Tipo> node = new Node<>(elemento);
			this.inicio.setAnterior(node);
			node.setProximo(this.inicio);
			this.inicio = node;
			this.tamanho++;
		}
		
	}
	
	//Adciciona novo nó no final da lista
	public void adicionaFinal(Tipo elemento) {
		if(estaVazia()) {
			Node<Tipo> node = new Node<>(elemento);
			this.inicio = node;
			this.fim = node;
			this.tamanho++;
		} else {
			if(estaNaLista(elemento)) {
				throw new IllegalArgumentException("Erro: o elemento já está na lista");
			}
			Node<Tipo> node = new Node<>(elemento);
			this.fim.setProximo(node);
			node.setAnterior(this.fim);
			this.fim = node;
			this.tamanho++;
		}
	}
	
	//Substitui o valor de um elemento na lista
	public void alteraElemento(Tipo elemento, Tipo novoElemento) {
		if(!estaNaLista(elemento)) {
			throw new NoSuchElementException("O elemento não está na lista");
		}
		
		Node<Tipo> atual = this.inicio;
		while(atual != null) {
			if (atual.getElemento().equals(elemento)) {
				 atual.setElemento(novoElemento);
				 return;
			}
			atual = atual.getProximo();
		}
	}
	
	
	//Exclui um elemento na lista
	public void excluirElemento(Tipo elemento) { //Falta implementar
		if(!estaNaLista(elemento)) {
			throw new NoSuchElementException("O elemento não está na lista");
		}
		
		Node<Tipo> atual = this.inicio;
		
	}
	
	//Imprime na tela os elementos da lista e o seu tamanho
	public void mostrarElementos() {
		if(estaVazia()) {
			System.out.println("[]");
			return;
		}
		Node<Tipo> atual = this.inicio;
		System.out.println(atual.getElemento());
		while(atual.getProximo() != null) {
			atual = atual.getProximo();
			System.out.println(atual.getElemento());
		}
		System.out.println("Quantidade de elementos na lista: "+ this.tamanho);
	}
	
	//Diz se um elemento está ou não na lista
	private boolean estaNaLista(Tipo elemento) {
		Node<Tipo> atual = this.inicio;
		while(atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	} 
	
}
