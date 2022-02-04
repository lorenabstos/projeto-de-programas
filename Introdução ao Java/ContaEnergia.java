package LAB1;

import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int consumo_energia = scan.nextInt();

        System.out.print("");
        char tipo_instalacao = scan.next().charAt(0);

        double preco;

        switch (tipo_instalacao) {
            case 'R':
                if (consumo_energia <= 0) {
                    System.out.print("-1.00");
                }
                else if (consumo_energia <= 500) {
                    preco = consumo_energia * 0.40;
                    System.out.printf("%.2f\n", preco);
                } else {
                    preco = consumo_energia * 0.65;
                    System.out.printf("%.2f\n", preco);
                }
                break;
            case 'C':
                if (consumo_energia <= 0) {
                    System.out.print("-1.00");
                }
                else if (consumo_energia <= 1000) {
                    preco = consumo_energia * 0.55;
                    System.out.printf("%.2f\n", preco);
                } else {
                    preco = consumo_energia * 0.60;
                    System.out.printf("%.2f\n", preco);
                }
                break;
            case 'I':
                if (consumo_energia <= 0) {
                    System.out.print("-1.00");
                }
                else if (consumo_energia <= 5000) {
                    preco = consumo_energia * 0.55;
                    System.out.printf("%.2f\n", preco);
                } else {
                    preco = consumo_energia * 0.60;
                    System.out.printf("%.2f\n", preco);
                }
                break;
            default:
                System.out.print("-1.00");
        }
        scan.close();
    }
}
