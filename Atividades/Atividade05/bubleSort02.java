public class bubleSort02 {
    public static void main (String args[]){
        String[] nomes = {"Ana", "Beatriz", "Davi", "Dayane", "Denise", "Gabriel", "Kaua", "Luciene", "Rogerio"};
        for (int i=0; i<nomes.length-1; i++){
            int cont = 0;
            for (int c=0; c<nomes.length-1; c++){
                if (nomes[c].compareToIgnoreCase(nomes[c+1]) > 0){
                    String aux = nomes[c];
                    nomes[c] = nomes[c+1];
                    nomes[c+1] = aux;
                    cont++;  
                }
            }
            if (cont ==0){
                break;
            }
        }
        for (int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }    
}