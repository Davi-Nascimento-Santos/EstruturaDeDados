import java.util.Scanner;
import java.util.Arrays;
public class moda {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite as quantidade de elementos: ");
        int num = scan.nextInt();
        double[] array = new double[num];
        for (int i=0; i<num; i++){
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            array[i] = scan.nextDouble();
        }
        double[][] mod = new double[num][2];
        int cont=0;
        for (int i=0; i<num; i++){
            boolean esta = false;
            for (int c=0; c<num; c++){
                if (array[i] == mod[c][0]){
                    esta= true;
                    break;
                }
            }
            if (esta==false){
                mod[cont][0] = array[i];
                mod[cont][1] = 1;
                cont++;
            }else{
                for (int n=0; n<num; n++){
                    if (array[i] == mod[n][0]){
                        mod[n][1]++;
                        break;
                    }
                }
            }
        }
        double maior=0;
        for (int i=0; i<cont; i++){
            if (i==0){
                maior = mod[i][1];
            }else if (mod[i][1] > maior){
                maior = mod[i][1];
            }
        }
        boolean iguais = true;
        for (int i=0; i<cont; i++){
            if (mod[i][1] != maior){
                iguais = false;
                break;
            }
        }
        if (iguais==true){
            System.out.println("Não há moda.");
            return;
        }
        for (int i=0; i<cont; i++){
            if (mod[i][1] == maior){
                System.out.println("Mo = " + mod[i][0]);
            }
        }
    }
}
