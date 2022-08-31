package classes;

import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu");
        int ano = teclado.nextInt();
        int idade = 2022 - ano;
        System.out.print("A idade da pessoa é " + idade);
    }
}
