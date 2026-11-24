
import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");

        valor = ler.nextInt();

        if (valor > 0) {
            System.out.println("O valor " + valor + " é positivo.");
        }
        else if (valor < 0) {
            System.out.println("O valor " + valor + " é negativo.");
        }
        else {
            System.out.println("O valor " + valor + " é neutro.");
        }
        
    }
}
