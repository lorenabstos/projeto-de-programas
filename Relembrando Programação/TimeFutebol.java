package LAB2;

import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0, j=0, vitorias=0, empates=0, derrotas=0;
        int[] golsVas = new int[100];
        int[] golsFla = new int[100];

        golsVas[i] = scan.nextInt();
        while (golsVas[i] != -1) {
            i++;
            golsVas[i] = scan.nextInt();
        }

        golsFla[j] = scan.nextInt();
        while (golsFla[j] != -1) {
            j++;
            golsFla[j] = scan.nextInt();
        }

        for (int k=0; k<i; k++) {
            if (golsVas[k] > golsFla[k]) {
                vitorias += 1;
            } else if (golsVas[k] == golsFla[k]) {
                empates += 1;
            } else {
                derrotas += 1;
            }
        }
        System.out.print(vitorias + " ");
        System.out.print(empates + " ");
        System.out.print(derrotas);
        scan.close();
    }
}
