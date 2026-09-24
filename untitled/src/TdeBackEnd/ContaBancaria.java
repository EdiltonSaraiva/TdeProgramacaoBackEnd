package TdeBackEnd;

public class ContaBancaria {

    private int _numero;
    private String _titular;
    private double _saldo;

    public ContaBancaria(int numero, String titular) {
        this._numero = numero;
        this._titular = titular;
        this._saldo = 0;
    }

    public double depositar(double valor) {

        return 0;
    }

    public double sacar(double valor) {

        return 0;
    }

    public void getTitular(String titular) {

        this._titular = titular;
    }

    public void getNumero(int numero) {

        this._numero = numero;
    }

    public void getSaldo(double saldo) {

        this._saldo = saldo;
    }

    public void get() {

    }
}
