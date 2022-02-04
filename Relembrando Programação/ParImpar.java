package LAB2;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int entrada = scan.nextInt();

        while (entrada != -1) {
            if (entrada % 2 == 0) {
                System.out.print("PAR");
            } else {
                System.out.print("IMPAR");
            }
            entrada = scan.nextInt();
            System.out.println();
        }

        scan.close();
    }
}
