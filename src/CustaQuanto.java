
import java.util.Scanner;

public class CustaQuanto {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double custoFabrica;

        System.out.print("Qual o valor de fabrica do veículo? R$");
        custoFabrica = ler.nextDouble();

        double distribuidor = (custoFabrica * 0.28);
        double imposto = (custoFabrica * 0.45);
        double custoFinal = custoFabrica + distribuidor + imposto;

        System.out.printf("\n* Custo veículo(Fábrica): R$%.2f", custoFabrica);
        System.out.printf("\n* Custo distribuidor: R$%.2f", distribuidor);
        System.out.printf("\n* Custo imposto: R$%.2f\n", imposto);

        System.out.printf("\nO custo final do veiculo é R$%.2f\n", custoFinal);

    }
}
