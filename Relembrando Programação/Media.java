package LAB2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double count = 0, media;

        for (int i=0; i<3; i++) {
            System.out.print("");
            double entrada = scan.nextDouble();
            count += entrada;
        }
         media = count/3;

        System.out.printf("%.2f", media);

        scan.close();
    }
}
