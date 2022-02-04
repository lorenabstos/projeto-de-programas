package LAB2;

import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = 6371.00;
        double t1 = scan.nextDouble();
        double g1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double g2 = scan.nextDouble();

        double p1 = Math.toRadians(t1);
        double p2 = Math.toRadians(g1);
        double p3 = Math.toRadians(t2);
        double p4 = Math.toRadians(g2);

        double distancia = raio * Math.acos(Math.sin(p1) * Math.sin(p3) + Math.cos(p1) * Math.cos(p3) * Math.cos(p2 - p4));
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1, g1, t2, g2, distancia);
        scan.close();
    }
}
