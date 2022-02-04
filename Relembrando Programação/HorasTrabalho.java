package LAB2;

import java.util.Scanner;
public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1, j=1, acumulador=0;
        int[][] matriz = new int[8][8];
        int[] vetor = new int[8];
        /*for (i=1; i<=7; i++) {
            for (j=1; j<=7; j++) {
                matriz[i][j] = scan.nextInt();
                acumulador += matriz[i][j];
            }
            System.out.println(acumulador);
            acumulador = 0;
        }*/

        vetor[i] = scan.nextInt();
        while (vetor[i] != -1) {
            acumulador += vetor[i];
            for (i=1; i<=7; i++) {
                vetor[i] = scan.nextInt();
                acumulador += vetor[i];
            }
            System.out.println(acumulador);
            //i=1;
            acumulador = 0;
            //vetor[i] = scan.nextInt();
        }

        scan.close();
    }
}
