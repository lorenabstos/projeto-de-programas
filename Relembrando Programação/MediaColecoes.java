package LAB2;

import java.util.Scanner;
public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double acumulador = 0, contador = 0;
        int numero = scan.nextInt();
        while (numero != -1){
            while (numero != -1) {
                contador++;
                acumulador += numero;
                numero = scan.nextInt();
            }
            System.out.printf("%.2f\n", acumulador/contador);
            contador = 0;
            acumulador = 0;
            numero = scan.nextInt();
        }
        scan.close();
    }
}
