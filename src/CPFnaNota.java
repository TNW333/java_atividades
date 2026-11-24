
import java.util.Scanner;

public class CPFnaNota {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String resposta;
        String nomeProduto;
        int quantidadeProduto;
        double precoUnitario;
        double desconto;


        do{

            System.out.println("========== NOTA FISCAL ==========\n");

            System.out.print("Produto: ");
            nomeProduto = ler.next();

            System.out.print("Quantidade: ");
            quantidadeProduto = ler.nextInt();

            System.out.print("Preco unitário: R$");
            precoUnitario = ler.nextDouble();

            double valorVenda = quantidadeProduto * precoUnitario;

            if (quantidadeProduto <= 5){
                desconto = 0.02;
            }

            else if (quantidadeProduto <= 10){
                desconto = 0.03;
            }

            else{
                desconto = 0.05;
            }

            double descontoCalculado = valorVenda * desconto;

            double imposto = 0.2 * valorVenda;
            double totalAPagar = valorVenda - descontoCalculado;

            System.out.println("\n\n=================================");

            System.out.printf("\n* Produto: %s", nomeProduto);
            System.out.printf("\n* Valor da venda: R$%.2f", valorVenda);
            System.out.printf("\n* Desconto aplicado: %.0f%%", desconto * 100);
            System.out.printf("\n* Valor do desconto: R$%.2f", descontoCalculado);
            System.out.printf("\n* Imposto (20%%) R$%.2f", imposto);

            System.out.printf("\n\nTotal a pagar: R$%.2f", totalAPagar);

            System.out.println("\n\n=================================");

            System.out.println("Deseja adicionar outro produto? (S/N)");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") &&
                    !resposta.equalsIgnoreCase("N")) {

                System.out.println("Resposta inválida! Digite S ou N.");
                resposta = ler.next();
            }
        } while(resposta.equalsIgnoreCase("S"));


    }
}
