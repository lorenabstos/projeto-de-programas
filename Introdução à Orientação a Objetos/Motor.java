package LAB3;

public class Motor {
    double capacidade;
    int tipo, potencia;

    Motor() { this(0, 0.0, 0); }

    Motor(int tipo, double capacidade, int potencia) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }

    public String getTipoString() {
        switch (this.tipo) {
            case 1:
                return ("Gasolina");
            case 2:
                return ("Alcool");
            case 3:
                return ("Flex");
            case 4:
                return ("Diesel");
            case 5:
                return ("Eletrico");
            default:
                return ("Outros");
        }
    }

    public String getDescricao() {
        return ("LAB3.Motor: tipo=" + getTipoString() + ",\ncapacidade=" + capacidade + "L, potencia=" + potencia + "CV.");
    }
}
