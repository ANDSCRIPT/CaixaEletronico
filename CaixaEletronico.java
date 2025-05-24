package CaixaEletronico;
import java.util.Scanner;

public class CaixaEletronico{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        boolean executando = true;

        // Faça um programa que simule um caixa eletrônico simples:
        while(executando){
        
            System.out.println("-----CAIXA ELETRONICO-----");
            System.out.println("MENU DE OPÇÕES: ");
            System.out.println("1- Consultar Saldo.");
            System.out.println("2- Depositar.");
            System.out.println("3- Sacar.");
            System.out.println("4- Sair.");

            // Mostre um menu com opções:

            int operacao = scanner.nextInt();
            
            // Comece com um saldo inicial fictício (ex: R$1000).
             
            

            switch (operacao) {
                case 1:// Consultar saldo
                    
                    System.out.println("O seu saldo é: R$ " + saldo);
                    break;

                case 2:// Depositar
                    System.out.println("O senhor deseja depositar quanto?");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0){
                        saldo += deposito;
                        System.out.println("Deposito realizado com sucesso! Novo Saldo: R$" + saldo);
                    }else{
                        System.out.println("Valor invalido para deposito.");
                    }
                    break;
            
                case 3:// Sacar
                    System.out.println("O senhor deseja sacar qual valor?");
                    int saque = scanner.nextInt();
                    if(saque > 0 && saque <= saldo){
                    saldo -= saque;
                        System.out.println("Saque Realizado. Novo Saldo. R$ " + saldo);

                    }else{
                        System.out.println("Saque invalido. Verifique o valor digitado.");
                    }
                    break;

                case 4:// Sair
                    System.out.println("Obrigado por utilizar nosso sistema. Até a proxima!");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção Invalida, Tente novamente.");

                

                System.out.println();
                    
            }

            
        }
        scanner.close();
    }
}


