package TdeBackEnd;

public class Quarto {
    private int _numero;
    private String _tipo;
    private double _precoPorNoite;
    private boolean _estaOcupado;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this._numero = numero;
        this._tipo = tipo;
        setPrecoPorNoite(precoPorNoite);
        this._estaOcupado = false;
    }

    public int getNumero() {
        return _numero;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String tipo) {
        this._tipo = tipo;
    }

    public double getPrecoPorNoite() {
        return _precoPorNoite;
    }

    public void setPrecoPorNoite(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this._precoPorNoite = preco;
    }

    public boolean isEstaOcupado() {
        return _estaOcupado;
    }

    public void reservar() {
        if (_estaOcupado) {
            System.out.println("Quarto " + _numero + " ja esta ocupado!");
            return;
        }
        _estaOcupado = true;
        System.out.println("Quarto " + _numero + " reservado com sucesso.");
    }

    public void liberar() {
        if (!_estaOcupado) {
            System.out.println("Quarto " + _numero + " ja esta livre.");
            return;
        }
        _estaOcupado = false;
        System.out.println("Quarto " + _numero + " liberado.");
    }

    public double calcularValor(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias invalidos");
        }
        return dias * _precoPorNoite;
    }
}