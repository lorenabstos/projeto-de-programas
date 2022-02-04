package LAB1;

import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int ano = scan.nextInt();

        int anos = ano - 1909;

        System.out.println("A UFAM tem " + anos + " anos de fundacao");

        scan.close();
    }
}
