package TdeBackEnd;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", "Analista Jr", 3500.00, "MAT001", "TI");
        f1.exibirDados();

        System.out.println("--- Apos promocao ---");
        f1.promover("Analista Pleno", 1500.00);
        f1.transferir("Desenvolvimento");
        f1.exibirDados();

        System.out.println("--------------------");

        Funcionario f2 = new Funcionario("Ana", "Designer", 4000.00, "MAT002", "Marketing");
        f2.promover("Designer Senior", 2000.00);
        f2.exibirDados();
    }
}