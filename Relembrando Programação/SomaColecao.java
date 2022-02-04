package LAB2;

import java.util.Scanner;
public class SomaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acumulador = 0;
        int entrada = scan.nextInt();
        while (entrada != -1) {
            acumulador += entrada;
            entrada = scan.nextInt();
        }
        System.out.print(acumulador);
        scan.close();
    }
}
