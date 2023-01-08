import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Calculadora de Indice de Massa Corporal\nInsira seu peso (em Kgs): ");
        var peso = Scanner.nextDouble();

        System.out.print("Insira sua altura (em cm): ");
        var alturaCm = Scanner.nextDouble();

        var altura = alturaCm / 100;
        var imc = peso / Math.pow(altura, 2);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Seu índice de massa corporal é de " + df.format(imc));
    }
}