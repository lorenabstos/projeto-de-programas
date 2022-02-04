package LAB2;

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();

        if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
            System.out.print("invalido");
        } else if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.print("invalido");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.print("equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3 ) {
            System.out.print("isosceles");
        } else {
            System.out.print("escaleno");
        }
        scan.close();
    }
}
