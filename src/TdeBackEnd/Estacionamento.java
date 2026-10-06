package TdeBackEnd;

public class Estacionamento {
    private String _placa;
    private String _modelo;
    private Tempo _horaEntrada;
    private Tempo _horaSaida;


    public Estacionamento() {
        this._placa = "";
        this._modelo = "";
        this._horaEntrada = new Tempo(); // 00:00:00
        this._horaSaida = new Tempo();   // 00:00:00
    }


    public Estacionamento(String placa, String modelo, Tempo horaEntrada, Tempo horaSaida) {
        this._placa = placa;
        this._modelo = modelo;
        this._horaEntrada = horaEntrada;
        this._horaSaida = horaSaida;
    }


    public String getPlaca() {
        return _placa;
    }

    public void setPlaca(String placa) {
        this._placa = placa;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String modelo) {
        this._modelo = modelo;
    }

    public Tempo getHoraEntrada() {
        return _horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this._horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return _horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this._horaSaida = horaSaida;
    }


    public void imprimirDados() {
        System.out.println("=== Dados do Carro Estacionado ===");
        System.out.println("Placa: " + _placa);
        System.out.println("Modelo: " + _modelo);
        System.out.print("Hora de Entrada: ");
        _horaEntrada.mostrarTempo();
        System.out.print("Hora de Saída: ");
        _horaSaida.mostrarTempo();
    }


    public double calcularValorPago() {
        int segundosEntrada = _horaEntrada.calcularSegundos();
        int segundosSaida = _horaSaida.calcularSegundos();


        if (segundosSaida < segundosEntrada) {
            segundosSaida += 24 * 3600;
        }

        int diferencaSegundos = segundosSaida - segundosEntrada;


        double horas = diferencaSegundos / 3600.0;
        double horasCobradas = Math.ceil(horas);


        if (horasCobradas == 0) {
            horasCobradas = 1;
        }

        return horasCobradas * 1.50;
    }
}
