package LAB1;

import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int num = scan.nextInt();
        
        for (int k=0; k<num/2; k++) {
            for (int i=0; i<num; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            for (int j=0; j<num; j++) {
                System.out.print(" " + "*");
            }
            System.out.print("\n");
        }

       /*for(int i=0; i<num; i++) {
            System.out.print("*");
            for(int j=0; j<num; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        scan.close();
    }
}
