package TdeBackEnd;

public class MainNotaFiscal {
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal("P001", "Parafuso de aco", 100, 0.50);

        System.out.println("Peca: " + nf.getDescricaoPeca());
        System.out.println("Quantidade: " + nf.getQuantidadeComprada());
        System.out.printf("Total da Nota: R$ %.2f%n", nf.getTotalNota());

        try {
            nf.setQuantidadeComprada(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
