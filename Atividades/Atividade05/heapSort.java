public class heapSort {
    public void sort(String arr[]){
        int N = arr.length;
 
        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
 
        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void heapify(String arr[], int N, int i){
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l].compareToIgnoreCase(arr[largest]) > 0)
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r].compareToIgnoreCase(arr[largest]) > 0)
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }
    public static void main(String args[]){
        String[] nomes = {"Gabriel", "Davi", "Ana", "Beatriz", "Kaua", "Denise", "Dayane", "Rogerio", "Luciene"};
        int N = nomes.length;
        heapSort ob = new heapSort();
        ob.sort(nomes);
        for (int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
    
}
