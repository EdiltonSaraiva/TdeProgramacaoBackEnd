package TdeBackEnd;

public class Tempo {
    private int _horas;
    private int _minutos;
    private int _segundos;

    public Tempo() {
        this._horas = 0;
        this._minutos = 0;
        this._segundos = 0;
    }

    public Tempo(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void mostrarTempo() {
        System.out.printf("%02d:%02d:%02d\n", this._horas, this._minutos, this._segundos);
    }

    public int calcularMinutos() {
        return (this._horas * 60) + this._minutos + (this._segundos / 60);
    }

    public int calcularSegundos() {
        return (this._horas * 3600) + (this._minutos * 60) + this._segundos;
    }

    public int getHoras() {
        return _horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this._horas = horas;
        } else {
            System.out.println("Hora inválida (" + horas + ")");
        }
    }

    public int getMinutos() {
        return _horas;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this._minutos = minutos;
        } else {
            System.out.println("Minutos inválidos (" + minutos + ")");
        }
    }

    public int getSegundos() {
        return _segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this._segundos = segundos;
        } else {
            System.out.println("Segundos inválidos (" + segundos + ")");
        }
    }
}