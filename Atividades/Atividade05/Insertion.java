import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Insertion {
	/*Function to sort array using insertion sort*/
	static void sort(String arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]){
        String[] vetor = new String[10];
		File teste = new File("teste.txt");

        try(FileReader br = new FileReader(teste)){
            BufferedReader ex = new BufferedReader(br);
            for(int i = 0; i < vetor.length ; i++ ){
                vetor[i] = ex.readLine();
            }
        }catch(Exception erro){
            System.out.println("Deu ERRO");
        }
        //sort(vetor);
        for(int i = 0; i < vetor.length ; i++ ){
            System.out.println(vetor[i]);
        }
	}
}
