import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = ler.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = ler.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);

    }
}
