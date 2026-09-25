package TdeBackEnd;

public class MainAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", 20, "2024001", "Sistemas de Informacao");
        a1.adicionarNota(8.5);
        a1.adicionarNota(7.0);
        a1.adicionarNota(9.0);

        System.out.println("Aluno: " + a1.getNome());
        System.out.printf("Media: %.2f%n", a1.calcularMedia());
        System.out.println("Situacao: " + a1.verificarAprovacao());

        System.out.println("--------------------");

        Aluno a2 = new Aluno("Marina", 22, "2024002", "Sistemas de Informacao");
        a2.adicionarNota(5.0);
        a2.adicionarNota(6.0);

        System.out.println("Aluno: " + a2.getNome());
        System.out.printf("Media: %.2f%n", a2.calcularMedia());
        System.out.println("Situacao: " + a2.verificarAprovacao());
    }
}
