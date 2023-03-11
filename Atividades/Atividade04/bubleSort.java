public class bubleSort{
    public static void main(String args[]){
        char[] nome = {'C', 'O', 'M', 'P', 'U', 'T', 'A', 'C', 'A', 'O', 'U', 'F', 'P', 'I', 'H'};
        System.out.println(nome);
        for (int i=0; i<nome.length-1; i++){
            for (int c=0; c<nome.length-1; c++){
                if (nome[c] > nome[c+1]){
                    char aux = nome[c];
                    nome[c] = nome[c+1];
                    nome[c+1] = aux;
                }
            }
        }
        System.out.println(nome);
    }    
}