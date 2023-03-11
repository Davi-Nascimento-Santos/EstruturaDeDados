public class selectionSort {
    public static void main(String args[]){
        String[] nomes = {"Gabriel", "Caio", "Davi", "Ana", "Beatriz", "Kaua", "Denise", "Dayane", "Rogerio", "Luciene"};
        for (int i = 0; i < nomes.length; i++) {
            
            int i_menor = i;
            for (int j = i + 1; j < nomes.length; j++)
                if (nomes[j].compareToIgnoreCase(nomes[i_menor])<0)
                    i_menor = j;
            
            String aux = nomes[i];
            nomes[i] = nomes[i_menor];
            nomes[i_menor] = aux;
        
        }
        for (int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
    
}
