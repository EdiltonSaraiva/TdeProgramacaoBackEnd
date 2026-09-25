package TdeBackEnd;

public class Funcionario {
    private String _nome;
    private String _cargo;
    private double _salario;
    private String _matricula;
    private String _departamento;

    public Funcionario(String nome, String cargo, double salario, String matricula, String departamento) {
        this._nome = nome;
        this._cargo = cargo;
        setSalario(salario);
        this._matricula = matricula;
        this._departamento = departamento;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getCargo() {
        return _cargo;
    }

    public void setCargo(String cargo) {
        this._cargo = cargo;
    }

    public double getSalario() {
        return _salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salario invalido");
        }
        this._salario = salario;
    }

    public String getMatricula() {
        return _matricula;
    }

    public void setMatricula(String matricula) {
        this._matricula = matricula;
    }

    public String getDepartamento() {
        return _departamento;
    }

    public void setDepartamento(String departamento) {
        this._departamento = departamento;
    }

    public void promover(String novoCargo, double aumento) {
        if (aumento < 0) {
            throw new IllegalArgumentException("Aumento invalido");
        }
        this._cargo = novoCargo;
        this._salario += aumento;
        System.out.println(_nome + " promovido para " + novoCargo + ". Novo salario: R$ " + _salario);
    }

    public void transferir(String novoDepartamento) {
        this._departamento = novoDepartamento;
        System.out.println(_nome + " transferido para: " + novoDepartamento);
    }

    public void exibirDados() {
        System.out.println("Nome: " + _nome);
        System.out.println("Cargo: " + _cargo);
        System.out.printf("Salario: R$ %.2f%n", _salario);
        System.out.println("Matricula: " + _matricula);
        System.out.println("Departamento: " + _departamento);
    }
}
