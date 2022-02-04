package LAB2;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int numero = scan.nextInt();
        int unidade, soma=0;

        while (numero > 0) {
            unidade = numero % 10;
            soma += unidade;
            numero /= 10;
        }
        System.out.println(soma);
        scan.close();
    }
}
