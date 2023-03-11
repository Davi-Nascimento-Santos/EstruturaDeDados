import java.util.Scanner;
import java.util.Arrays;
public class mediana{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num;
	    System.out.println("Digite a quantidade elementos: ");
	    num = scan.nextInt();
	    double[] array = new double[num];
	    for (int i=0; i<num; i++){
	        System.out.println("Digite o " + (i+1) + "º elemento: ");
	        array[i] = scan.nextDouble();
	    }
	    Arrays.sort(array);
	    if (num%2!=0){
	        System.out.println(array[num/2]);
	    }else{
	        double sum = array[num/2-1] + array[num/2];
	        System.out.println(sum/2);
	    }
	}
}
