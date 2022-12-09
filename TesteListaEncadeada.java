package listaligada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteListaEncadeada {

	@Test
	void testAdiciona() {
		
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		assertTrue(lista.estaVazia());
		
		lista.adicionaFinal("Primeiro No");
		assertFalse(lista.estaVazia());
		assertEquals(1, lista.getTamanho());
		
		lista.adicionaFinal("Segundo No");
		assertFalse(lista.estaVazia());
		assertEquals(2, lista.getTamanho());
		
		lista.adicionaFinal("Terceiro No");
		assertFalse(lista.estaVazia());
		assertEquals(3, lista.getTamanho());
		
		lista.adicionaFinal("Quarto No");
		assertFalse(lista.estaVazia());
		assertEquals(4, lista.getTamanho());
		
		lista.adicionaInicio("Antes do primeiro");
		assertEquals(5, lista.getTamanho());
		
		lista.mostrarElementos();
		lista.alteraElemento("Terceiro No", "Substituto");
		System.out.println("\n\n");
		lista.mostrarElementos();
	
	}
}
