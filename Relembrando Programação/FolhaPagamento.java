package LAB2;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        double valor_hora = scan.nextDouble();

        System.out.print("");
        int horas = scan.nextInt();

        double salario_bruto = valor_hora * horas;
        double imposto_renda = 0.11 * salario_bruto;
        double inss = 0.08 * salario_bruto;
        double descontos = imposto_renda + inss;
        double salario_liquido = salario_bruto - descontos;

        System.out.printf("Salario bruto: R$%.2f", salario_bruto);
        System.out.printf("\nIR: R$%.2f", imposto_renda);
        System.out.printf("\nINSS: R$%.2f", inss);
        System.out.printf("\nTotal de descontos: R$%.2f", descontos);
        System.out.printf("\nSalario liquido: R$%.2f", salario_liquido);
        scan.close();
    }
}

