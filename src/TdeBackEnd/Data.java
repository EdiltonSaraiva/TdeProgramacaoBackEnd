package TdeBackEnd;

public class Data {
    private int _mes;
    private int _dia;
    private int _ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public boolean verificarBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private int diasNoMes(int mes, int ano) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && verificarBissexto(ano)) {
            return 29;
        }
        if (mes >= 1 && mes <= 12) {
            return diasPorMes[mes - 1];
        }
        return 31;
    }

    public void mostrarData() {
        System.out.println("\n--- DATA DIGITADA ---");
        System.out.printf("    (%02d/%02d/%04d)\n", this._dia, this._mes, this._ano);
    }

    public int calcularDias(int numeroMes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (verificarBissexto(this._ano)) {
            diasPorMes[1] = 29;
        }
        int totalDias = 0;

        for (int i = 0; i < numeroMes - 1; i++) {
            totalDias += diasPorMes[i];
        }

        return totalDias;
    }

    public int calcularDiasDecorridosNoAno() {
        return calcularDias(this._mes) + this._dia;
    }

    public int getDia() {
        return _dia;
    }

    public void setDia(int dia) {
        int mesConsulta = (this._mes >= 1 && this._mes <= 12) ? this._mes : 1;
        int maxDias = diasNoMes(mesConsulta, this._ano);

        if (dia >= 1 && dia <= maxDias) {
            this._dia = dia;
        } else {
            System.out.println("Erro: dia inválido (" + dia + ") para o mês " + mesConsulta);
        }
    }

    public int getMes() {
        return _mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this._mes = mes;
        } else {
            System.out.println("Mês inválido (" + mes + "). Deve ser de 1 a 12!");
        }
    }

    public int getAno() {
        return _ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this._ano = ano;
        } else {
            System.out.println("Ano inválido (" + ano + ")");
        }
    }
}