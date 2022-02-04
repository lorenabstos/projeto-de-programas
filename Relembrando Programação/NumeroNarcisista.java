package LAB2;

import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k, digito;
        double acumulador=0, potencia;

        int entrada = scan.nextInt();
        String digitos = Integer.toString(entrada);
        k = digitos.length(); //k = quantidade de dígitos do número

        for (int i=0; i<k; i++) {
            digito = Character.getNumericValue(digitos.charAt(i));
            potencia = Math.pow(digito, k);
            acumulador += potencia;
        }

        if (acumulador == entrada) { System.out.print("SIM"); }
        else { System.out.print("NAO"); }
        scan.close();
    }
}
