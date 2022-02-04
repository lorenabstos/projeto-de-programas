package LAB2;

import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int qtdeCaracteres = str.length();
        char primeiroCaractere = str.charAt(0);
        char ultimoCaractere = str.charAt(qtdeCaracteres-1);
        String caracteresMaiusculos = str.toUpperCase();
        String caracteresMinusculos = str.toLowerCase();
        String substituicaoCaracteres = str.replace('a', 'e');
        int qtdeVogais = str.replaceAll("[^aeiouAEIOU]","").length();

        System.out.println(qtdeCaracteres);
        System.out.println(primeiroCaractere);
        System.out.println(ultimoCaractere);
        System.out.println(caracteresMaiusculos);
        System.out.println(caracteresMinusculos);
        System.out.println(substituicaoCaracteres);

        int contador = 0;
        while (contador <= qtdeCaracteres-1) {
            System.out.print(str.charAt(contador));
            contador += 2;
        }

        System.out.println();
        System.out.println(qtdeVogais);

        scan.close();
    }
}

