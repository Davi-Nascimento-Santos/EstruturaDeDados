import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

class Main{

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("\n-------------------------- Mini Menu --------------------------");
        System.out.println("1.ArrayList");
        System.out.println("2.Vector");
        System.out.println("3.LinkedList");
        System.out.println("4.HashSet");
        System.out.println("5.LinkedHashSet");
        System.out.println("6.TreeSet");
        System.out.println("7.HashMap");
        System.out.println("8.LinkedHashMap");
        System.out.println("9.TreeMap");
        System.out.println("0.Sair");
        System.out.println("\n----------------------------------------------------------------");
        System.out.print("Digite a opção que deseja: ");
        op = input.nextInt();
        return op;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        //1º Questão
        TabelaArrayList<String, Integer> tabelaArray = new TabelaArrayList<String, Integer>();
        TabelaVector<String, Integer> tabelaVector = new TabelaVector<String, Integer>();
        TabelaLinkedList<String, Integer> tabelaLinkedList = new TabelaLinkedList<String, Integer>();

        //2ª Questão
        TabelaHashSet<String, Integer> tabelaHashSet = new TabelaHashSet<String, Integer>();
        TabelaLinkedHashSet<String, Integer> tabelaLinkedHashSet = new TabelaLinkedHashSet<String, Integer>();
        TabelaTreeSet tabelaTreeSet = new TabelaTreeSet();

        //3ª Questão
        TabelaHashMap<String, Integer> tabelaHashMap = new TabelaHashMap<>();
        LinkedHashMap<String, Integer> tabelaLinkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> tabelaTreeMap = new TreeMap<>();

        Scanner scan = new Scanner(System.in);
        File file = new File("/home/davi/Documents/CienciaDaComputacao/2Periodo/EstruturaDeDados/Atividades/AtividadeFinal/questao01/leipzig100k.txt");
        try {
            int opcao = menu();
            Scanner scanner = new Scanner(file);
            int cont =0;
            long tempoInicial = System.nanoTime();
            while (scanner.hasNext()) {
                String linha = scanner.next();
                Entry<String, Integer> no = new Entry<String, Integer>(linha, cont);
                switch(opcao){
                    case 1:
                        tabelaArray.put(linha, cont);
                        break;
                    case 2:
                        tabelaVector.put(linha, cont);
                        break;
                    case 3:
                        tabelaLinkedList.put(linha, cont);
                        break;
                    case 4:
                        tabelaHashSet.put(linha, cont);
                        break;
                    case 5:
                        tabelaLinkedHashSet.put(linha, cont);
                        break;
                    case 6:
                        tabelaTreeSet.add(linha, cont);
                        break;
                    case 7:
                        tabelaHashMap.put(no.getKey(), no.getValue());
                        break;
                    case 8:
                        tabelaLinkedHashMap.put(no.getKey(), no.getValue());
                        break;
                    case 9:
                        tabelaTreeMap.put(no.getKey(), no.getValue());
                        break;
                    case 0:
                        return;
                }
                cont++;
            }
            long tempoFinal = System.nanoTime();
            long tempoDecorrido = (tempoFinal - tempoInicial) / 1000000;
            System.out.println("Tempo de execução: " + tempoDecorrido);
            scanner.close();
            String[] nomes = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};
            
            //Pesquisa das palavras
            long tempoInicialv2 = System.nanoTime();
            long tempoFinalv2 = 0;
            long tempoDecorridov2 = 0;
            switch(opcao){
                case 1:
                    for (String n: nomes){
                        tabelaArray.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 2:
                    for (String n: nomes){
                        tabelaVector.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 3:
                    for (String n: nomes){
                        tabelaLinkedList.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 4:
                    for (String n: nomes){
                        tabelaHashSet.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 5:
                    for (String n: nomes){
                        tabelaLinkedHashSet.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 6:
                    for (String n: nomes){
                        tabelaTreeSet.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 7:
                    for (String n: nomes){
                        tabelaHashMap.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 8:
                    for (String n: nomes){
                        tabelaLinkedHashMap.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 9:
                    for (String n: nomes){
                        tabelaTreeMap.get(n);
                    }
                    tempoFinalv2 = System.nanoTime();
                    break;
                case 0:
                    return;
            }
            tempoDecorridov2 = (tempoFinalv2 - tempoInicialv2);
            System.out.println("Tempo de pesquisa: " + tempoDecorridov2);
            

            //Remoção das palavras
            long tempoInicialv3 = System.nanoTime();
            long tempoFinalv3 = 0;
            long tempoDecorridov3 = 0;
            switch(opcao){
                case 1:
                    for (String n: nomes){
                        tabelaArray.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 2:
                    for (String n: nomes){
                        tabelaVector.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 3:
                    for (String n: nomes){
                        tabelaLinkedList.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 4:
                    for (String n: nomes){
                        tabelaHashSet.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 5:
                    for (String n: nomes){
                        tabelaLinkedHashSet.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 6:
                    for (String n: nomes){
                        tabelaTreeSet.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 7:
                    for (String n: nomes){
                        tabelaHashMap.pop(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 8:
                    for (String n: nomes){
                        tabelaLinkedHashMap.remove(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 9:
                    for (String n: nomes){
                        tabelaTreeMap.remove(n);
                    }
                    tempoFinalv3 = System.nanoTime();
                    break;
                case 0:
                    return;
            }
            tempoDecorridov3 = (tempoFinalv3 - tempoInicialv3);
            System.out.println("Tempo de remoção: " + tempoDecorridov3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}