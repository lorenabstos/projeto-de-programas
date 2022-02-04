package LAB2;

import java.util.Scanner;
public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i, saida = 0;
        double entrada = scan.nextInt();

        for (i=1; i<=entrada; i++) {
            double serie = 4/((2*i) * (2*i-1) * (2*i-2));

            if (i == 1) { saida = 3; }
            else if (i % 2 == 0) { saida += serie; }
            else { saida -= serie; }

            System.out.printf("%.6f\n", saida);
        }
    }
}
