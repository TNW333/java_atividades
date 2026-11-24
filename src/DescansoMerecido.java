
import java.util.Scanner;
import java.time.LocalDate;

public class DescansoMerecido {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int codEmpregado;
        int anoAtual = LocalDate.now().getYear();
        int anoNascimento;
        int anoIngressoEmpresa;
        String aposentadoria;
        String resposta;


        do{

            System.out.print("Digite o código do empregado: ");
            codEmpregado = ler.nextInt();

            System.out.print("Digite o ano de nascimento do funcionário: ");
            anoNascimento = ler.nextInt();

            while(anoNascimento >= anoAtual || anoNascimento <= 1900){
                System.out.println("\nDigite um ano válido!");
                System.out.print("Digite o ano de nascimento do funcionário: ");
                anoNascimento = ler.nextInt();
            }

            System.out.print("Digite o ano de ingresso na empresa: ");
            anoIngressoEmpresa = ler.nextInt();

            while(anoIngressoEmpresa >= anoAtual || anoIngressoEmpresa <= 1900 || anoIngressoEmpresa > anoNascimento){
                System.out.println("\nDigite um ano válido!");
                System.out.print("Digite o ano de ingresso na empresa: ");
                anoIngressoEmpresa = ler.nextInt();
            }


            int idade = anoAtual - anoNascimento;
            int tempoTrabalho = anoAtual - anoIngressoEmpresa;

            if(idade >= 65 || tempoTrabalho >= 30 || idade >= 60 && tempoTrabalho >= 25){
                aposentadoria = "Requerer aposentadoria";
            } else{
                aposentadoria = "Não requerer";
            }

            System.out.printf("""
                    
                    APOSENTADORIA 
                    
                    Código do empregado: %d
                    Idade: %d anos
                    Tempo de trabalho: %d anos
                    
                    %s
                    
                
                    """, codEmpregado, idade, tempoTrabalho, aposentadoria);


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

