package TdeBackEnd;

public class ContaBancaria {

    private int _numero;
    private String _titular;
    private double _saldo;

    private ContaBancaria[] _contasBancarias;

    public ContaBancaria() {
        this._contasBancarias = new ContaBancaria[2];
        this._contasBancarias[0] = new ContaBancaria(1234, "Maria");
        this._contasBancarias[1] = new ContaBancaria(5678, "João");
    }

    public ContaBancaria(int numero, String titular) {
        this._numero = numero;
        this._titular = titular;
        this._saldo = 0.0;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this._saldo += valorDeposito;
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && this._saldo >= valorSaque) {
            this._saldo -= valorSaque;
        }
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int numero) {
        this._numero = numero;
    }

    public String getTitular() {
        return _titular;
    }

    public void setTitular(String titular) {
        this._titular = titular;
    }

    public double getSaldo() {
        return _saldo;
    }

    public void setSaldo(double saldo) {
        this._saldo = saldo;
    }

    public ContaBancaria getContaBancaria(int contaBancaria) {
        return this._contasBancarias[contaBancaria];
    }
}
