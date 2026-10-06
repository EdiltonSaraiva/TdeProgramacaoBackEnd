package TdeBackEnd;

public class MainEstacionamento {
    public static void main(String[] args) {
        // Criando os objetos Tempo para entrada e saída
        Tempo entrada1 = new Tempo(10, 30, 0);
        Tempo saida1 = new Tempo(14, 45, 0);

        // Criando o Estacionamento com os dados do carro
        Estacionamento carro1 = new Estacionamento("ABC-1234", "Fiat Uno", entrada1, saida1);

        // Imprimindo os dados
        carro1.imprimirDados();

        // Calculando e mostrando o valor a pagar
        double valor1 = carro1.calcularValorPago();
        System.out.printf("Valor a pagar: R$ %.2f%n", valor1);

        System.out.println("---------------------------------");

        // Segundo exemplo usando o construtor padrão e setters
        Estacionamento carro2 = new Estacionamento();
        carro2.setPlaca("XYZ-9876");
        carro2.setModelo("VW Gol");
        carro2.setHoraEntrada(new Tempo(22, 0, 0));
        carro2.setHoraSaida(new Tempo(2, 30, 0)); // saiu no dia seguinte

        carro2.imprimirDados();
        double valor2 = carro2.calcularValorPago();
        System.out.printf("Valor a pagar: R$ %.2f%n", valor2);
    }
}
