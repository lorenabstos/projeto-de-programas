package LAB2;

import java.util.Scanner;
public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acumulador = 0;
        int numero = scan.nextInt();
        while (numero != -1){
            while (numero != -1) {
                acumulador += numero;
                numero = scan.nextInt();
            }
            System.out.println(acumulador);
            acumulador = 0;
            numero = scan.nextInt();
        }
        scan.close();
    }
}
