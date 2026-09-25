package TdeBackEnd;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner insereDadosBancarios = new Scanner(System.in);

        ContaBancaria banco = new ContaBancaria();
        ContaBancaria contaCadastrada = null;

        /* Checar o número das contas de Maria e João
        no construtor da classe ContaBancaria */

        System.out.println("\n--- BANCO ---");
        System.out.print("Digite o número da sua conta:\t");
        int numeroDigitado = insereDadosBancarios.nextInt();

        for (int contaNoBanco = 0; contaNoBanco < 2; contaNoBanco++) {
            if (banco.getContaBancaria(contaNoBanco).getNumero() == numeroDigitado) {
                contaCadastrada = banco.getContaBancaria(contaNoBanco);
                break;
            }
        }

        if (contaCadastrada == null) {
            System.out.println("Erro: Conta não encontrada no sistema.");
            return;
        }

        System.out.println("\nAutenticado com sucesso! Olá, " + contaCadastrada.getTitular() + ".");
        int opcaoBancaria;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Ver Dados e Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoBancaria = insereDadosBancarios.nextInt();

            switch (opcaoBancaria) {
                case 1:
                    System.out.println("\n-- EXTRATO --");
                    System.out.println("Titular: " + contaCadastrada.getTitular());
                    System.out.println("Número da Conta: " + contaCadastrada.getNumero());
                    System.out.println("Saldo Disponível: R$" + contaCadastrada.getSaldo());
                    break;

                case 2:
                    System.out.print("\nDigite o valor para depósito: R$");
                    double valorDep = insereDadosBancarios.nextDouble();
                    contaCadastrada.depositar(valorDep);
                    break;

                case 3:
                    System.out.print("\nDigite o valor para saque: R$");
                    double valorSaq = insereDadosBancarios.nextDouble();
                    contaCadastrada.sacar(valorSaq);
                    break;

                case 0:
                    System.out.println("\nSaindo da conta... Obrigado!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcaoBancaria != 0);
    }
}
