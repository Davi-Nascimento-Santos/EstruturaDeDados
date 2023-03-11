import java.util.Scanner;
public class alunos {
    public static int maisNovo(int[] idades){
        int menor=0;
        for (int i=0; i<idades.length; i++){
            if (i==0){
                menor = idades[i];
            }else if (idades[i] < menor){
                menor = idades[i];
            }
        }
        return menor;
    }
    public static int maisVelho(int[] idades){
        int maior=0;
        for (int i=0; i<idades.length; i++){
            if (i==0){
                maior = idades[i];
            }else if (idades[i] > maior){
                maior = idades[i];
            }
        }
        return maior;
    }
    public static void show(String[] nomes, int[] idades){
        int menor = maisNovo(idades);
        int maior = maisVelho(idades);
        System.out.println("Pessoa(s) mais nova(s):");
        for (int i=0; i<nomes.length; i++){
            if (idades[i] == menor){
                System.out.println(nomes[i] + " tem idade " + menor);
            }
        }
        System.out.println("Pessoa(s) mais velha(s):");
        for (int i=0; i<idades.length; i++){
            if (idades[i] == maior){
                System.out.println(nomes[i] + " tem idade " + maior);
            }
        }
    }
    public static double mediaIdade(int[] idades){
        int sum=0;
        for (int i=0; i<idades.length; i++){
            sum+=idades[i];
        }
        double media = (double)sum/idades.length;
        return media;
    }
    public static void menu(String[] nomes, int[] idades){
        while(true){
            System.out.println("Menu");
            System.out.println("1 - Mostrar Pessoas mais velhas e mais novas");
            System.out.println("2 - Mostrar a media de idade das pessoas");
            System.out.println("3 - Sair do código");
            int num;
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
            switch(num){
                case 1: 
                    show(nomes, idades);
                    break;
                case 2:
                    System.out.println(mediaIdade(idades));
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Erro, Digite um valor correto!");
            }
        }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
        System.out.print("Digite a quantidade de pessoas: ");
		n = Integer.parseInt(scan.nextLine());
		String[] nomes = new String[n];
		int[] idades = new int[n];
		for (int i=0; i<n; i++){
            System.out.print("Nome: ");
		    nomes[i] = scan.nextLine();
            System.out.print("Idade: ");
		    idades[i] = Integer.parseInt(scan.nextLine());
        }
		menu(nomes, idades);
	}
}
