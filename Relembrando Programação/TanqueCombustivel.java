package LAB2;

import java.util.Scanner;
public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = Math.PI;
        double volumeAr, volumeEsfera, volumeCombustivel;
        int raio = scan.nextInt();
        int altura = scan.nextInt();

        int opcao = scan.nextInt();

        volumeAr = (pi/3.0) * Math.pow(altura, 2) * (3 * raio - altura);
        volumeEsfera = (4 * pi * Math.pow(raio, 3)) / 3;
        volumeCombustivel = volumeEsfera - volumeAr;
        if (opcao == 1) {
            System.out.printf("%.4f", volumeAr);
        } else if (opcao == 2) {
            System.out.printf("%.4f", volumeCombustivel);
        }
        scan.close();
    }
}
