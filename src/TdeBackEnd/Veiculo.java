package TdeBackEnd;

public class Veiculo {

    private String _marcaVeiculo;
    private String _modeloVeiculo;
    private int _anoFabricacao;
    private String _corVeiculo;

    public Veiculo(String marca, String modelo, int ano, String cor) {
        setMarcaVeiculo(marca);
        setModeloVeiculo(modelo);
        setAnoFabricacao(ano);
        setCorVeiculo(cor);
    }

    public void exibirDadosVeiculo() {
        System.out.println("Marca do veículo: " + this._marcaVeiculo);
        System.out.println("Modelo do veículo: " + this._modeloVeiculo);
        System.out.println("Ano de fabricação do veículo: " + this._anoFabricacao);
        System.out.println("Cor do veículo: " + this._corVeiculo);
    }

    public String getMarcaVeiculo() {
        return _marcaVeiculo;
    }

    public void setMarcaVeiculo(String marca) {
        this._marcaVeiculo = marca;
    }

    public String getModeloVeiculo() {
        return _modeloVeiculo;
    }

    public void setModeloVeiculo(String modelo) {
        this._modeloVeiculo = modelo;
    }

    public int getAnoFabricacao() {
        return _anoFabricacao;
    }

    public void setAnoFabricacao(int ano) {
        this._anoFabricacao = ano;
    }

    public String getCorVeiculo() {
        return _corVeiculo;
    }

    public void setCorVeiculo(String cor) {
        this._corVeiculo = cor;
    }
}
