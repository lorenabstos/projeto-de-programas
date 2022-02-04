package LAB2;

import java.util.Scanner;
public class DataExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.next();

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                          "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String dia = data.substring(0, 2);
        String mesStr = data.substring(2, 4);
        String ano = data.substring(4, 8);
        int mes = Integer.parseInt(mesStr);
        System.out.print(dia + " de " + meses[mes-1] + " de " + ano);

        scan.close();
    }
}
