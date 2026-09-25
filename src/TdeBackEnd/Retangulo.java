package TdeBackEnd;

public class Retangulo {
    private double _length;
    private double _width;

    public Retangulo() {
        this._length = 1.0;
        this._width = 1.0;
    }

    public Retangulo(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calcularPerimetro() {
        return 2 * (this._length + this._width);
    }

    public double calcularArea() {
        return this._length * this._width;
    }

    public double getLength() {
        return 0;
    }
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this._length = length;
        } else {
            System.out.println("Erro: Comprimento (" + length + ") deve ser maior que 0.0 e menor que 20.0. Valor mantido: " + this._length);
        }
    }
    public double getWidth() {
        return 0;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this._width = width;
        } else {
            System.out.println("Erro: Largura (" + width + ") deve ser maior que 0.0 e menor que 20.0. Valor mantido: " + this._width);
        }
    }
}
