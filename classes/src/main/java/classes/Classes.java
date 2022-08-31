package classes;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Classes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu");
        int ano = teclado.nextInt();
        int anoAtual = LocalDateTime.now().getYear();
        int idade = anoAtual - ano;
        System.out.print("A idade da pessoa é " + idade + " anos");
    }
}
