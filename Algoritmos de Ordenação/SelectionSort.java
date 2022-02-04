public class SelectionSort {
    public static void main(String[] args){
        int i, j, aux, trocas=0;
        int[] vetor = {6, 5, 3, 1, 8, 9, 7, 2, 4};

        System.out.print("Vetor Desordenado:");
        for(i=0; i<9; i++){
            System.out.print(" " + vetor[i]);
        }

        System.out.println(" ");

        for (i=0; i<8; i++) {
            int menor = i;
            for (j=i+1; j<9; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux;
                trocas++;
            }
        }

        System.out.print("Vetor Ordenado:");
        for(i=0; i<9; i++){
            System.out.print(" " + vetor[i]);
        }

        System.out.print("\nTrocas: " + trocas);
    }
}
