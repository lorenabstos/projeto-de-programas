package LAB2;

import java.util.Scanner;
public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = Math.PI;
        int alturaTanque = scan.nextInt();
        int nivelCombustivel = scan.nextInt();
        int raioBojos = scan.nextInt();

        //cálculos
        double volumeCalotaEsferica = (pi * Math.pow(nivelCombustivel, 2) * (3 * raioBojos - nivelCombustivel))/3;
        double calotaEsferica = (pi * Math.pow((nivelCombustivel - raioBojos), 2) * (3 * raioBojos - (nivelCombustivel - raioBojos)))/3;
        double volumeCilindro = pi * Math.pow(raioBojos, 2) * nivelCombustivel;
        double cilindro = pi * Math.pow(raioBojos, 2) * (nivelCombustivel - raioBojos);
        double volumeEsfera = (4 * pi * Math.pow(raioBojos, 3))/3;

        if (nivelCombustivel > alturaTanque || alturaTanque <= 0 || raioBojos <= 0) { System.out.print("-1.000"); }
        else if (nivelCombustivel < raioBojos) { System.out.printf("%.3f", volumeCalotaEsferica); }
        else if (nivelCombustivel > alturaTanque - raioBojos) { System.out.printf("%.3f", (volumeEsfera + volumeCilindro - calotaEsferica)); }
        else if (nivelCombustivel == raioBojos) { System.out.printf("%.3f", volumeEsfera/2); }
        else if (nivelCombustivel <= alturaTanque - raioBojos) { System.out.printf("%.3f", (volumeEsfera/2) + cilindro); }
    }
}
