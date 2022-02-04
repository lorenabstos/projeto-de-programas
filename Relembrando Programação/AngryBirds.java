package LAB2;

import java.util.Scanner;
public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double velocidadeInicial = scan.nextDouble();
        double angulo = scan.nextDouble();
        double distancia = scan.nextDouble();

        double alpha = Math.toRadians(angulo);

        double R = (Math.pow(velocidadeInicial, 2) * Math.sin(2*alpha)) / 9.8;
        double tolerancia = distancia - R;
        if (tolerancia <= 0.1) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        scan.close();
    }
}
