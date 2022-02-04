package LAB2;

import java.util.Scanner;

public class ArteAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j;
        int entrada = scan.nextInt();

        /*while (entrada > 0) {
            for (i=0; i<entrada; i++) {
                System.out.print('*');
            }
            entrada--;
            System.out.println();
        }*/

        for (i=entrada; i>0; i--) {
            for (j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (i=0; i<=entrada; i++) {
            for (j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        scan.close();
    }
}
