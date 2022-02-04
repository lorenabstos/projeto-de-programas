package LAB2;

import java.util.Scanner;
public class CifraCesar {
    public static String encriptar(int desloc, String textoOriginal) {
        StringBuilder textoCifrado = new StringBuilder();
        for (int i=0; i<textoOriginal.length(); i++) {
            textoCifrado.append(encriptar(desloc, textoOriginal.charAt(i)));
        }
        return textoCifrado.toString();
    }

    public static char encriptar(int desloc, char charOriginal) {
        char charCifrado;
        if (charOriginal >= 97 && charOriginal <= 122) {
            charCifrado = (char) ((charOriginal - 97 + desloc) % 26 + 97);
        } else if (charOriginal >= 65 && charOriginal <= 90) {
            charCifrado = (char) ((charOriginal - 65 + desloc) % 26 + 65);
        } else {
            charCifrado = charOriginal;
        }
        return charCifrado;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorDeslocamento = scan.nextInt();
        String textoOriginal = scan.nextLine();

        String textoCriptografado = encriptar(valorDeslocamento, textoOriginal);
        System.out.print(textoCriptografado.toUpperCase().replaceAll("( +)"," ").trim());
        scan.close();
    }
}
