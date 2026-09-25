package TdeBackEnd;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner insereMedidas = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("\nValores padrão iniciais:\nComprimento -> " + retangulo.getLength() + "\nLargura -> " + retangulo.getWidth() + "\n");

        System.out.print("Digite o COMPRIMENTO (deve ser entre 0.0 e 20.0):\t");
        double novoComprimento = insereMedidas.nextDouble();
        retangulo.setLength(novoComprimento);

        System.out.print("Digite a LARGURA (deve ser entre 0.0 e 20.0):\t");
        double novaLargura = insereMedidas.nextDouble();
        retangulo.setWidth(novaLargura);

        System.out.println("\n--- Retângulo Feito ---");
        System.out.println("Comprimento: " + retangulo.getLength());
        System.out.println("Largura: " + retangulo.getWidth());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Área: " + retangulo.calcularArea());
    }
}
