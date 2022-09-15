package supercalculadora;

import java.util.Scanner;

public class SuperCalculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha um numero");
        double numero = teclado.nextInt();
        restoDaDivisaoPorDois(numero);
        elevadoAoCubo(numero);
        raizQuadrada(numero);
        raizCubica(numero);
        valorAbsoluto(numero);
    }
    
    public static void restoDaDivisaoPorDois(double numero) {
        double resto = numero % 2;
        System.out.println("A divisão do " + numero + " é " + resto);
    }
    
    public static void elevadoAoCubo(double numero) {
        double numeroElevado = Math.pow(numero, 3);
        System.out.println("O " + numero + " elevado ao cubo é " + numeroElevado);
    }
    
    public static void raizQuadrada(double numero) {
        double raizQuadrada = Math.sqrt(numero);
        System.out.println("A raiz quadrada do " + numero + " é " + String.format("%.2f", raizQuadrada));
    }
    
    public static void raizCubica(double numero) {
        double raizCubica = Math.cbrt(numero);
        System.out.println("A raiz cubica do " + numero + " é " + String.format("%.2f", raizCubica));
    }
    
    public static void valorAbsoluto(double numero) {
        double valorAbsoluto = Math.abs(numero);
        System.out.println("O número absoluto de " + numero + " é " + valorAbsoluto);
    }
}
