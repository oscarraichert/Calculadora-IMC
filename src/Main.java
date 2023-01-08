import java.util.Scanner;

public class Main {

    public static Scanner Scanner;

    public static void main(String[] args) {
        Scanner = new Scanner(System.in);

        System.out.print("Calculadora de Indice de Massa Corporal\nInsira seu peso (em Kgs): ");
        var peso = Scanner.nextDouble();

        System.out.print("Insira sua altura (em cm): ");
        var alturaCm = Scanner.nextDouble();

        var altura = alturaCm / 100;
        var imc = peso / Math.pow(altura, 2);

        System.out.println("Seu índice de massa corporal é de " + imc);
    }
}