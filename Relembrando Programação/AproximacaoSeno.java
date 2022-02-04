package LAB2;

import java.util.Scanner;
public class AproximacaoSeno {
    public static double Fatorial(double numero) {
        double fatorial = 1;
        for (int i=1; i<=numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static double Seno(double numero) {
        int contador = 0;
        double numeroRad = Math.toRadians(numero);
        double seno, potenciaUm = 1, potenciaTres = 3, somaPositiva = 0, somaNegativa = 0;
        do {
            somaPositiva += Math.pow(numeroRad, potenciaUm)/Fatorial(potenciaUm);
            potenciaUm += 4;

            somaNegativa -= Math.pow(numeroRad, potenciaTres)/Fatorial(potenciaTres);
            potenciaTres += 4;

            contador++;
        } while (contador < 4);
        seno = somaNegativa + somaPositiva;
        return seno;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i;
        double anguloGraus = scan.nextDouble();
        double numTermos = scan.nextDouble();
        //double anguloRadianos = Math.toRadians(anguloGraus);

        for (i=1; i<=numTermos; i++) {
            double serie = Seno(anguloGraus);
            System.out.printf("%.10f\n", serie);
        }

        scan.close();
    }
}
