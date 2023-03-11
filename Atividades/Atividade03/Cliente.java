import java.util.NoSuchElementException;
import java.util.Scanner;
public class Cliente {
	public static int menu() {
		Scanner input = new Scanner(System.in);
		int resp;
		System.out.print("\n------------------ Bem Vindo!!!!! ------------------\n");
		System.out.print("1- Chegada de Pessoa na Fila.\n");
		System.out.print("2- Atendimento do Primeiro Cliente.\n");
		System.out.print("3- Listar Todas as Pessoas da Fila.\n");
		System.out.print("4- Gerar Estastísticas do Atendimento.\n");
		System.out.print("0- Sair\n");
		System.out.print("\n----------------------------------------------------------\n");
		System.out.print("Qual será a opção selecionada: ");
		resp = input.nextInt();
		return resp;
	}
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String nome = null;
       int resp, idade = 0;
       Fila fila = new Fila();
       do {
    	   resp = menu();
    	   switch(resp) {
    		   case 1:
    			   System.out.print("Por favor, digite o nome e a idade: ");
    			   nome = input.nextLine();
    			   idade = Integer.parseInt(input.nextLine());
    			   fila.adicionar(nome, idade);
    			   System.out.println("\nNome Cadastrado com Suscesso.\n");
    			   break;
    		   case 2:
    			   try {
    				   fila.remover();
    			   System.out.println("\nCliente atendido!\n");
    			   }catch(NoSuchElementException e) {
    				   System.out.println(e.getMessage());
    			   }
    			   
    			   break;
    		   case 3:
    			   System.out.println(fila.toString());
    			   break;
    		   case 4:
    			   System.out.println(fila.estatistica());
    			   break;
    		   case 0:
    			   if(fila.getTamanho() != 0) {
    				   System.out.println("\nA fila ainda há pessoas.\n");
    				   resp = 3;
    				   break;
    			   }
    			   else
    				   break;
			   default:
				   System.out.println("\nOpção Incorreta!!!\n");
    	   }	   
       }while(resp != 0);
    }
    
}


