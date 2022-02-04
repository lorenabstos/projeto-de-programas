package LAB2;

import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somaElementos=0, maior=0, menor;
        int qtdeElementos=0, qtdeElementosPares=0, qtdeElementosImpares=0;
        int entrada = scan.nextInt();

        while (entrada != -1){
            menor = entrada;
            while (entrada != -1) {
                qtdeElementos++;
                somaElementos += entrada;

                if (entrada % 2 == 0) {
                    qtdeElementosPares++;
                } else {
                    qtdeElementosImpares++;
                }

                if (entrada > maior) {
                    maior = entrada;
                }

                if (entrada < menor) {
                    menor = entrada;
                }

                entrada = scan.nextInt();
            }
            System.out.println(qtdeElementos);
            System.out.println(qtdeElementosPares);
            System.out.println(qtdeElementosImpares);
            System.out.println(somaElementos);
            System.out.printf("%.2f\n", (double) somaElementos / qtdeElementos);
            System.out.println(maior);
            System.out.println(menor);

            maior=0;
            somaElementos=0;
            qtdeElementos=0;
            qtdeElementosPares=0;
            qtdeElementosImpares=0;

            entrada = scan.nextInt();
        }

        scan.close();
    }
}
