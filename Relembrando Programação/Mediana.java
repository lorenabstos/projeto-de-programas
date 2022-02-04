package LAB2;

import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double mediana;
        int[] vetor = new int[100];
        vetor[i] = scan.nextInt();
        while (vetor[i] != -1) {
            i++;
            vetor[i] = scan.nextInt();
        }
        if (i % 2 == 0) {
            mediana = ((double) vetor[(i - 1)/2] + vetor[(i + 1)/2])/2;
            System.out.print(mediana);
        } else {
            mediana = (vetor[i/2]);
            System.out.print(mediana);
        }
        scan.close();
    }
}
