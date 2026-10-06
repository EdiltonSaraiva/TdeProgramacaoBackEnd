package TdeBackEnd;

import java.util.Scanner;

public class MainVeiculo {
    public static void main(String[] args) {
       Scanner insereDadosVeiculo = new Scanner(System.in);

        System.out.println("--- VEÍCULO ---\n");

        System.out.print("Digite a marca do veículo:\t");
        String marcaDoVeiculo = insereDadosVeiculo.nextLine();

        System.out.print("Digite o modelo do veículo:\t");
        String modeloDoVeiculo = insereDadosVeiculo.nextLine();

        System.out.print("Digite o ano de fabricação do veículo:\t");
        int anoDoVeiculo = Integer.parseInt(insereDadosVeiculo.nextLine());

        System.out.print("Digite a cor do veículo:\t");
        String corDoVeiculo = insereDadosVeiculo.nextLine();

        System.out.println("\n--- VEÍCULO CADASTRADOO ---");
        Veiculo veiculo = new Veiculo(marcaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, corDoVeiculo);
        veiculo.exibirDadosVeiculo();


    }
}
