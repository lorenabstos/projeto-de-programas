package LAB1;

import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=0, k=0, acertos=0;
        double porcentagem_acerto;
        int[] respostas = new int[100];
        int[] gabarito = new int[100];

        System.out.print("");
        respostas[i] = scan.nextInt();

        while (respostas[i] != -1) {
            i++;
            System.out.print("");
            respostas[i] = scan.nextInt();
        }

        System.out.print("");
        gabarito[k] = scan.nextInt();

        while (gabarito[k] != -1) {
            k++;
            System.out.print("");
            gabarito[k] = scan.nextInt();

            if (gabarito[k] == respostas[k]) {
                acertos++;
            }
        }

        porcentagem_acerto = (100.0 * acertos)/k;

        System.out.printf("%.2f", porcentagem_acerto);
        scan.close();
    }
}
