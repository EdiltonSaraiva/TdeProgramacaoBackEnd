package TdeBackEnd;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String _nome;
    private int _idade;
    private String _matricula;
    private String _curso;
    private List<Double> _notas;

    public Aluno(String nome, int idade, String matricula, String curso) {
        this._nome = nome;
        setIdade(idade);
        this._matricula = matricula;
        this._curso = curso;
        this._notas = new ArrayList<>();
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public int getIdade() {
        return _idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade invalida");
        }
        this._idade = idade;
    }

    public String getMatricula() {
        return _matricula;
    }

    public void setMatricula(String matricula) {
        this._matricula = matricula;
    }

    public String getCurso() {
        return _curso;
    }

    public void setCurso(String curso) {
        this._curso = curso;
    }

    public List<Double> getNotas() {
        return _notas;
    }

    public void adicionarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        _notas.add(nota);
    }

    public double calcularMedia() {
        if (_notas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (double n : _notas) {
            soma += n;
        }
        return soma / _notas.size();
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}


