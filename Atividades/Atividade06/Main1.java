import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("\n----------------------------- Mini Menu -----------------------------\n");
        System.out.println("1.Inserir elemento na tabela.");
        System.out.println("2.Pesquisar elemento na tabela.");
        System.out.println("3.Imprimir elementos da tabela.");
        System.out.println("0.Sair");
        System.out.println("\n---------------------------------------------------------------------\n");
        op = input.nextInt();
        return op;
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        HashTable1<String, Integer> tab = new HashTable1<>(26);
        int valor;
        boolean igual = true;
        while(igual){
            int op = menu();
            switch (op){
                case 1 -> {
                    Path diretorio = Paths.get("/home/davi/Documents/CienciaDaComputacao/2Periodo/EstruturaDeDados/Atividades/Atividade06/alunosED.txt");
                    List<String> linhas = Files.readAllLines(diretorio);
                    for(String chave : linhas){
                        valor = chave.charAt(0);
                        tab.put(chave, valor - 65);
                    }

                    break;
                }
                case 2 -> {
                    String pesquisa;
                    pesquisa = input.next();
                    System.out.println("Nome: " + tab.get(pesquisa));

                }
                case 3 -> {
                    tab.imprimir();
                    break;
                }
                case 0 -> igual = false;
            }
        }
    }
}