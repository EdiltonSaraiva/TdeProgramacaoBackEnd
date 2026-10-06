package TdeBackEnd;

import java.util.Scanner;

public class MainTempo {
    public static void main(String[] args) {

        Scanner insereTempo = new Scanner(System.in);
        int hh, mm, ss;

        System.out.println("--- TEMPO ---");

        do {
            System.out.print("Digite um número para horas (de 0 a 23):\t");
            hh = insereTempo.nextInt();
            if (hh < 0 || hh >= 24) {
                System.out.println("Hora inválida! Tente novamente.");
            }
        } while (hh < 0 || hh >= 24);

        do {
            System.out.print("Digite um número para minutos (de 0 a 59):\t");
            mm = insereTempo.nextInt();
            if (mm < 0 || mm >= 60) {
                System.out.println("Minuto inválido! Tente novamente.");
            }
        } while (mm < 0 || mm >= 60);

        do {
            System.out.print("Digite um número para segundos (de 0 a 59):\t");
            ss = insereTempo.nextInt();
            if (ss < 0 || ss >= 60) {
                System.out.println("Segundo inválido! Tente novamente.");
            }
        } while (ss < 0 || ss >= 60);

        Tempo tempo = new Tempo(hh, mm, ss);

        System.out.print("\n");
        tempo.mostrarTempo();

        int totalMinutos = tempo.calcularMinutos();
        int totalSegundos = tempo.calcularSegundos();

        System.out.println("\n--- Cálculo Minutos ---");
        System.out.println("-Tempo decorrido em minutos  : " + totalMinutos + " min");

        System.out.println("\n--- Cálculo Minutos ---");
        System.out.println("-Tempo decorrido em segundos : " + totalSegundos + " seg");

        System.out.print("\nHorário Configurado: ");
        tempo.mostrarTempo();
    }
}
