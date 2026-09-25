package TdeBackEnd;

public class MainQuarto {
    public static void main(String[] args) {
        Quarto q1 = new Quarto(101, "Simples", 120.00);
        Quarto q2 = new Quarto(202, "Suite", 350.00);

        q1.reservar();
        q1.reservar();
        System.out.printf("Valor 3 noites (101): R$ %.2f%n", q1.calcularValor(3));

        System.out.println("--------------------");

        q2.reservar();
        System.out.printf("Valor 2 noites (202): R$ %.2f%n", q2.calcularValor(2));
        q2.liberar();
    }
}
