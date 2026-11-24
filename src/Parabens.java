
import java.util.Scanner;

public class Parabens {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = ler.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\nSua nota foi: " + media);

        if (media >= 6){
            System.out.println("PARABÉNS!!! Você foi aprovado(a)!");
        }
        else{
            System.out.println("Você foi reprovado(a)!");
        }


    }
}
