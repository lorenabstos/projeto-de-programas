package LAB2;

import java.util.Scanner;
public class ValorExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0, k = 0;
        int numero = scan.nextInt();
        while (numero >= soma) {
            k++;
            soma += Math.pow(2, k);
        }
        System.out.print(k);
        scan.close();
    }
}
