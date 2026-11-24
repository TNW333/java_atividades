
import java.util.Scanner;


public class JornadaDeTrabalho {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double quantHorasTrabalhadas;
        double valorRecebidoHora;
        String resposta;


        do{

            System.out.print("Horas trabalhadas no mês: ");
            quantHorasTrabalhadas = ler.nextDouble();

            System.out.print("Valor da hora: R$");
            valorRecebidoHora = ler.nextDouble();

            double horaExtra = 0;
            double valorHoraExtra = 0;

            if(quantHorasTrabalhadas > 160){
                horaExtra = quantHorasTrabalhadas - 160;
                valorHoraExtra = horaExtra * valorRecebidoHora * 1.5;

            }

            double horasNormais = Math.min(quantHorasTrabalhadas, 160);
            double salario = horasNormais * valorRecebidoHora;

            double salarioTotal = salario + valorHoraExtra;

            System.out.println("\n========== FOLHA DE PAGAMENTO ==========");

            System.out.printf("\nHoras trabalhadas: %.0f", quantHorasTrabalhadas);
            System.out.printf("\nSalário por hora: R$ %.2f", valorRecebidoHora);

            System.out.printf("\n\nHoras normais: %.0f", horasNormais);
            System.out.printf("\nHoras extras: %.0f", horaExtra);

            System.out.printf("\n\nSalário normal: R$ %.2f", salario);
            System.out.printf("\nPagamento de horas extras: R$ %.2f", valorHoraExtra);

            System.out.printf("\n\nSALÁRIO TOTAL: R$ %.2f", salarioTotal);

            System.out.println("\n========================================");

            System.out.println("Deseja verificar outro funcionario? (S/N)");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") &&
                    !resposta.equalsIgnoreCase("N")) {

                System.out.println("Resposta inválida! Digite S ou N.");
                resposta = ler.next();
            }
        } while(resposta.equalsIgnoreCase("S"));


    }
}

