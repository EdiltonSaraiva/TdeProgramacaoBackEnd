package TdeBackEnd;

public class NotaFiscal {
   private String _numeroPeca;
   private String _descricaoPeca;
   private int _quantidadeComprada;
   private double _preco;

   public NotaFiscal(String numeroPeca, String descricaoPeca, int quantidade, double preco) {
       this._numeroPeca = numeroPeca;
       this._descricaoPeca = descricaoPeca;
       setQuantidadeComprada(quantidade);
       setPreco(preco);
   }

    public String getNumeroPeca() {
       return _numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this._numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return _descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this._descricaoPeca = descricaoPeca;
    }

    public int getQuantidadeComprada() {
        return _quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this._quantidadeComprada = quantidade;
    }

    public double getPreco() {
        return _preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this._preco = preco;
    }

    public double getTotalNota() {
        return _quantidadeComprada * _preco;
    }
}

