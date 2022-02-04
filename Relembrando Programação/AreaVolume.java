package LAB2;

import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = Math.PI;
        double raio = scan.nextDouble();

        double area = pi * Math.pow(raio, 2);
        double volume = (4.0/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.", raio, area);
        System.out.printf("\nUma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", raio, volume);
        scan.close();
    }
}
