package TdeBackEnd;

import java.util.Scanner;

public class MainData {
    public static void main(String[] args) {
        Scanner insereData = new Scanner(System.in);

        System.out.println("-------------------------------- DATA -------------------------------");
        System.out.println("JAN | FEV | MAR | ABR | MAI | JUN | JUL | AGO | SET | OUT | NOV | DEZ\n");

        System.out.print("Digite o ano:\t");
        int ano = Integer.parseInt(insereData.nextLine());

        System.out.print("Digite o mês (de 1 a 12): ");
        int mes = Integer.parseInt(insereData.nextLine());

        System.out.print("Digite o dia: ");
        int dia = Integer.parseInt(insereData.nextLine());

        Data dataDigitada = new Data(dia, mes, ano);

        dataDigitada.mostrarData();

        System.out.println("\n--- DIAS ATÉ A DATA ---");
        System.out.print("Quantidade de mês: " + dataDigitada.calcularDias(mes));
    }
}