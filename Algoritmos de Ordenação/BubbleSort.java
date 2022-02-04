public class BubbleSort {
    public static void main(String[] args){
        int i, j, aux, trocas=0;
        int[] vet = {6, 5, 3, 1, 8, 9, 7, 2, 4};

        System.out.print("Vetor Desordenado:");
        for(i=0; i<9; i++){
            System.out.print(" " + vet[i]);
        }

        System.out.println(" ");

        for(i=0; i<9; i++){
            for(j=0; j<8; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                    trocas++;
                }
            }
        }

        System.out.print("Vetor Ordenado:");
        for(i=0; i<9; i++){
            System.out.print(" " + vet[i]);
        }

        System.out.print("\nTrocas: " + trocas);
    }
}
