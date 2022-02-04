package LAB2;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int radicando = scan.nextInt();

        double raiz = Math.sqrt(radicando);
        System.out.printf("%.4f", raiz);

        scan.close();
    }
}
