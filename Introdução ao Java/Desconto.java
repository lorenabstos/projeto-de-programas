package LAB1;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        double preco = scan.nextDouble();

        if (preco >= 200.00) {
            double desconto = preco * 0.05;
            double novo_preco = preco - desconto;
            System.out.printf("%.2f\n", novo_preco);
        } else {
            System.out.printf("%.2f\n", preco);
        }
        scan.close();
    }
}
