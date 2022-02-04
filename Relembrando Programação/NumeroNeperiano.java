package LAB2;

import java.util.Scanner;
public class NumeroNeperiano {
    public static double Fatorial(double numero) {
        double fatorial = 1;
        for (int i=1; i<=numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double j, saida = 0;
        double entrada = scan.nextInt();

        for (j=0; j<entrada; j++) {
            double serie = 1/Fatorial(j);
            if (j == 0) { saida = 1;}
            else { saida += serie; }
        }
        System.out.printf("%.6f", saida);
        scan.close();
    }
}
