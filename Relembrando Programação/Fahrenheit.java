package LAB2;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        double temp_celsius = scan.nextDouble();

        double temp_fahrenheit = (9*temp_celsius)/5 + 32;
        System.out.printf("%.1f", temp_fahrenheit);
        scan.close();
    }
}