package LAB2;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ladoA = scan.nextInt();
        int ladoB = scan.nextInt();
        int ladoC = scan.nextInt();
        int s = (ladoA + ladoB + ladoC)/2;
        double area = Math.sqrt(s * (s-ladoA) * (s-ladoB) * (s-ladoC));
        if (ladoA < 0 || ladoB < 0 || ladoC < 0) {
            System.out.print("Triangulo invalido");
        } else if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            System.out.print("Triangulo invalido");
        } else {
            System.out.printf("%.2f", area);
        }
        scan.close();
    }
}
