package LAB2;

import java.util.Scanner;

public class AnimaisCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cedula = scan.nextInt();
        if (cedula == 2) {
            System.out.print("Tartaruga");
        } else if (cedula == 5) {
            System.out.print("Garça");
        } else if (cedula == 10) {
            System.out.print("Arara");
        } else if (cedula == 20) {
            System.out.print("Mico-leão-dourado");
        } else if (cedula == 50) {
            System.out.print("Onça-pintada");
        } else if (cedula == 100) {
            System.out.print("Garoupa");
        } else {
            System.out.print("erro");
        }
        scan.close();
    }
}
